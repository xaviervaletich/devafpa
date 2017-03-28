/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.RoleRight;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Salim El Moussaoui <salim.elmoussaoui.afpa2017@gmail.com>
 * @author Cedric DELHOME
 * @author Laure-Helene Soyeux
 */
public class RoleRightDAOTest {

    /**
     * Test of create method, of class RoleRightDAO.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        // create object roles_rights    
        RoleRight roles_rights = new RoleRight(7,true,false);
        RoleRightDAO roles_rightsDAO = new RoleRightDAO();
        // find roles_rights  create 
        RoleRight expResult = roles_rightsDAO.find(roles_rights.getUser_id());

        // if find use_id is 0
        if (!roles_rightsDAO.isValid(expResult)) {           
            // insert roles_rights in table
            RoleRight result = roles_rightsDAO.create(roles_rights);
            // find roles_rights
            expResult = roles_rightsDAO.find(roles_rights.getUser_id());   
            // delete roles_rights test
            roles_rightsDAO.delete(result.getUser_id());
            assertEquals(expResult, result); 
         
        }

    }

    /**
     * Test of update method, of class RoleRightDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        // create object roles_rights      
        RoleRight roles_rightsInsert = new RoleRight(6,false,false);
        // instatied roles_rightsDAO
        RoleRightDAO roles_rightsDAO = new RoleRightDAO();
        // find roles_rights create 
        RoleRight findRoleRight = roles_rightsDAO.find(roles_rightsInsert.getUser_id());
        // if find roles_rights is empty
        if (!roles_rightsDAO.isValid(findRoleRight)) {
            // Insert roles_rights in table
            RoleRight resultRoleRight = roles_rightsDAO.create(roles_rightsInsert);             
            // find roles_rights
            findRoleRight = roles_rightsDAO.find(resultRoleRight.getUser_id());
        }
            // modify roles_rights
            findRoleRight.setBlocked(true);

        // update roles_rights
        boolean result = roles_rightsDAO.update(findRoleRight);
        boolean expResult = true;
        // delete roles_rights test
        roles_rightsDAO.delete(findRoleRight.getUser_id());
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class RoleRightDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        RoleRightDAO roles_rightsDAO = new RoleRightDAO();

        // create object roles_rights	
        RoleRight roles_rightsInsert =  new RoleRight(9, true,false);
        // find roles_rights  create 
        RoleRight findRoleRight = roles_rightsDAO.find(roles_rightsInsert.getUser_id());

        // if find roles_rights is empty
        if (!roles_rightsDAO.isValid(findRoleRight)) {
            // Insert roles_rights in table
            RoleRight resultRoleRight = roles_rightsDAO.create(roles_rightsInsert);
            // find roles_rights
            findRoleRight = roles_rightsDAO.find(resultRoleRight.getUser_id());
            // delete roles_rights
            boolean result = roles_rightsDAO.delete(findRoleRight.getUser_id());
            boolean expResult = true;
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of findAll method, of class RoleRightDAO.
     */
    @Test
    public void testGetdAll() {
        System.out.println("findAll");
        RoleRightDAO roles_rightsDAO = new RoleRightDAO();
        ArrayList<RoleRight> arrayRoleRight = roles_rightsDAO.getAll();
        String expResult = "";
        String result = "";
        for (int i = 0; i < arrayRoleRight.size(); i++) {
            expResult += roles_rightsDAO.find(arrayRoleRight.get(i).getUser_id());
            result += arrayRoleRight.get(i);
        }
        assertEquals(expResult, result);

    }

    /**
     * Test of find method, of class RoleRightDAO.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        RoleRightDAO roles_rightsDAO = new RoleRightDAO();
        // assign primary key
        long primary_key = 96;
        // assign result exemple
        String expResult ="RolesRights{user_id=96, admin=true, blocked=false}";
        // find roles_rights
  
        String result = roles_rightsDAO.find(primary_key).toString();
        assertEquals(expResult, result);
    }
}
