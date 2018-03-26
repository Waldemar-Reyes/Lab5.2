package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;

public class DeleteListAction implements Action{

	@Override
	public void execute(Object arg) {
		DMComponent dm = (DMComponent) arg; 
		IOComponent io = IOComponent.getComponent();
		String listName = io.getInput("\nEnter the name of the list to delete: ");
		dm.removeList(listName);
	}
	
}
