package com.saurabh.FirstRest;


import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping(value="/getRating")
	public Object getRating(@RequestHeader("movieCode") String header, @RequestBody String requestBody)
	{
		ResponseData responseData=new ResponseData();
		List<MovieRating> listRating=new ArrayList<MovieRating>();
		String[] arrayString=header.split(",");
		System.out.println(arrayString);
		for(String str:arrayString)
		{
			if(str.equals("101") | str.equals("102"))
			{
				MovieRating rating =new MovieRating();
				rating.setMovieId(Integer.parseInt(str));
				rating.setRate(4);
				listRating.add(rating);
				System.out.println(listRating);
				//responseData.setRatingList(listRating);
			}
		}
		responseData.setRatingList(listRating);
		return responseData;
	}

}
