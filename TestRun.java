import rtcintface.*;


public class TestRun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ConfigEntity ce = new ConfigEntity();
		ce.InitalConfigEntity();
		RTCJavaClient rjc = new RTCJavaClient();
		rjc.login(ce.strRTCUserName, ce.strRTCUserPSD, ce.strRTCURL);
		int i = 0;
		try{
			i = rjc.countPersonalQueryByName(ce.strRTCProjectName, "as");
		}catch(Exception e)
		{
			System.out.print(e.toString());
		}
		System.out.print(i);
	}

}
