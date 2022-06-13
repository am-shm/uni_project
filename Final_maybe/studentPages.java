import javax.swing.*;

public class studentPages {
	public static class unitForm {
		String unitName,unitTeacher; //take from db
		JCheckBox unitCb;
		JLabel unitLabe,teacherLabel;
	}
	public static class teacherGradingForm {
		String teacherName;
		JLabel teacherLabel,goodL,badL;
		JCheckBox goodC,badC;
	}
	
	public static void unitSelect(JFrame mainFrame,int id){
		functions.menuBar.student(mainFrame);	
	}
	public static void removeUnit(JFrame mainFrame,int id){
		JLabel titleLabel = new JLabel("حذف واحد درسی");
		titleLabel.setBounds(800,150,100,30);
		mainFrame.add(titleLabel);

		String[] units = {"Math","AP","Phisycs"}/*store from DB*/ ;
		int lxoff=100,cxoff=65,yoff=200;
		unitForm[] unitToRemove = new unitForm[units.length];
		for(int i=0;i<unitToRemove.length;i++){
			unitToRemove[i] = new unitForm();
			unitToRemove[i].unitLabe = new JLabel();
			unitToRemove[i].unitCb = new JCheckBox();
			
			unitToRemove[i].unitLabe.setText(units[i]);

			unitToRemove[i].unitLabe.setBounds(lxoff,yoff,200,30);
			unitToRemove[i].unitCb.setBounds(cxoff,yoff,25,25);
			
			mainFrame.add(unitToRemove[i].unitLabe);
			mainFrame.add(unitToRemove[i].unitCb);
			
			yoff = yoff + 50;	
		}
	}
	public static void viewUnits(JFrame mainFrame,int id){
		functions.menuBar.student(mainFrame);
	}
	public static void teacherGrading(JFrame mainFrame,int id){
		functions.menuBar.student(mainFrame);
	}
	public static void eduStatus(JFrame mainFrame,int id){
		functions.menuBar.student(mainFrame);
	}
	public static void payment(JFrame mainFrame,int id){
		functions.menuBar.student(mainFrame);
	}
	public static void eshteghal(JFrame mainFrame,String nameStr){
		functions.menuBar.student(mainFrame);	
	}
	public static void showKarname(JFrame mainFrame,int id){
		functions.menuBar.student(mainFrame);	
	}

}
