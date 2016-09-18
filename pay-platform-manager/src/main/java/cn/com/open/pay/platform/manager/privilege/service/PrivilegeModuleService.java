package cn.com.open.pay.platform.manager.privilege.service;

import java.util.List;

import cn.com.open.pay.platform.manager.privilege.model.PrivilegeModule;
import cn.com.open.pay.platform.manager.privilege.model.TreeNode;


public interface PrivilegeModuleService {
	List<PrivilegeModule> findByName(String name);
	PrivilegeModule  getModuleById(Integer id);
	void savePrivilegeModule(PrivilegeModule privilegeModule);
	void updatePrivilegeModule(PrivilegeModule privilegeModule);
	void deletePrivilegeModule(Integer id);
	List<TreeNode>  getDepartmentTree();
	List<PrivilegeModule> findModuleByIds(List<Integer> ids);
   
    
}