import javax.swing.JOptionPane;

public class TongHieuTichThuong {
	public static void main(String[] args) {
		String strNum1;
		String strNum2;
		String strNotification = "You've just entered ";
		strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum1 + " and ";
		strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum2;
		JOptionPane.showMessageDialog(null, strNotification,"Show two numbers",JOptionPane.INFORMATION_MESSAGE);
		double num1 =Double.parseDouble(strNum1);
		double num2 =Double.parseDouble(strNum2);
		JOptionPane.showMessageDialog(null, num1 +num2,"Tong : ",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, num1 - num2,"Hieu : ",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, num1 * num2,"Tich: ",JOptionPane.INFORMATION_MESSAGE);
		if (num2 == 0) 
			JOptionPane.showMessageDialog (null,"Khong the thuc hien phep chia do mau = 0");
		else	
		JOptionPane.showMessageDialog(null, num1  / num2,"Thuong : ",JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}

