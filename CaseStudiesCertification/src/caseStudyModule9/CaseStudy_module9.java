package caseStudyModule9;

public class CaseStudy_module9 {

	public static void main(String[] args) throws Exception {
		
		String path = "C:\\Selenium\\Programs\\CaseStudiesCertification\\src\\caseStudyModule9\\TestData\\testData.xlsx";
		ReadExcelFile.setupExcel(path, "Actions");
		
		for (int i=0; i<=3; i++)
		{
			
			String Keyword = ReadExcelFile.getData(i, 1);
			if(Keyword.equals("openBrowser"))
			{
				ActionKeywords.openBrowser();
			}
			
			else if (Keyword.equals("logIn"))
			{
				ActionKeywords.logIn();
			}
			
			else if (Keyword.equals("seleniumBlogsNavigation"))
			{
				ActionKeywords.seleniumBlogsNavigation();
			}
			

				
		}
	}

}
