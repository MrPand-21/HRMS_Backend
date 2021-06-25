package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.ActivationPanelService;
import kodlama.io.hrms.business.constants.Messages;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.ActivationPanelDao;
import kodlama.io.hrms.dataAccess.abstracts.SystemUserDao;
import kodlama.io.hrms.entities.concretes.ActivationPanelForSystemUser;
import kodlama.io.hrms.entities.dtos.PanelForJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ActivationPanelManager implements ActivationPanelService {

    private ActivationPanelDao activationPanelDao;
    private SystemUserDao systemUserDao;

    @Autowired
    public ActivationPanelManager(ActivationPanelDao activationPanelDao,SystemUserDao systemUserDao) {
        this.activationPanelDao = activationPanelDao;
        this.systemUserDao = systemUserDao;
    }

    @Override
    public Result setApproved(PanelForJob panelForJob) {
        ActivationPanelForSystemUser activationPanel =
                activationPanelDao.getActivationPanelForSystemUserByJobId_Id(panelForJob.getJobId());

        activationPanel.setApproved(true);
        activationPanel.setSystemUser(systemUserDao.getById(panelForJob.getSystemUserId()));
        activationPanel.setActivationDate(new Date());
        activationPanel.setDetail(panelForJob.getDetail());

        activationPanelDao.save(activationPanel);

        activationPanelDao.save(activationPanel);
        return new SuccessResult(Messages.JobApproved);
    }

    @Override
    public Result setUnapproved(PanelForJob panelForJob) {

        ActivationPanelForSystemUser activationPanel =
                activationPanelDao.getActivationPanelForSystemUserByJobId_Id(panelForJob.getJobId());

        activationPanel.setApproved(false);
        activationPanel.setSystemUser(systemUserDao.getById(panelForJob.getSystemUserId()));
        activationPanel.setActivationDate(new Date());
        activationPanel.setDetail(panelForJob.getDetail());

        activationPanelDao.save(activationPanel);
        return new SuccessResult(Messages.JobUnapproved);
    }
}
