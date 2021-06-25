package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.dtos.PanelForJob;

public interface ActivationPanelService {

    Result setApproved(PanelForJob panelForJob);

    Result setUnapproved(PanelForJob panelForJob);

}
