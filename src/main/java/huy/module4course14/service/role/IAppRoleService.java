package huy.module4course14.service.role;

import huy.module4course14.model.AppRole;
import huy.module4course14.service.GeneralService;

public interface IAppRoleService extends GeneralService<AppRole> {
    AppRole findByName(String name);
}
