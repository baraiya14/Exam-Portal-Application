package com.MainApp.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.MainApp.Pojo.Section;
@Repository
public interface SectionRepo extends CrudRepository<Section, Integer> {
	
	List<Section> findByAdname(String adname);

}
