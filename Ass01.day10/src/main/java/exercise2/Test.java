package exercise2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;



public class Test {

	public static void main(String[] args) throws IOException {
		
		File file  = new File ("./src/main/resources/jobs.json");
		if(!file.exists()) {
			file.createNewFile();
		}
		

		Duration [] duration1 = {new Duration ("2016-01-01 00:00:00","2016-02-28 00:00:00")};
		Duration [] duration2 = {new Duration ("2017-06-30 00:00:00","2016-12-31 00:00:00")};
		Duration [] duration3 = {new Duration ("2017-01-01 00:00:00","2017-06-30 00:00:00")};
		//Jobs job = new Jobs ("ITHS", duration1, "Database teacher","Teacher for a Database course");
		
		Jobs job1 = new Jobs("ITHS",duration1,"Database teacher","Teacher for a Database course");
		Jobs job2 = new Jobs("GU",duration2,"Database teacher","Lecturer for an introductory Java course etc");
		Jobs job3 = new Jobs("Yrgo",duration3,"Java teacher","Teacher for a Java course");
		
		List<Jobs>jobList = new ArrayList<>();
		jobList.add(job1);
		jobList.add(job2);
		jobList.add(job3);
		
		
		Gson gson = new Gson();
		String json = gson.toJson(jobList);
		
		
		
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
			bufferedWriter.write(json);
		} catch (Exception e) {
			
		}
	}

}
