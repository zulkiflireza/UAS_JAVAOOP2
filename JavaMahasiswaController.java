package com.ursabyte.pisadatacollection.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pisaaksidb.constanta.ReturnData;
import com.ursabyte.pisaaksidb.model.JavaMahasiswa;
import com.ursabyte.pisaaksidb.model.JavaMatkul;
import com.ursabyte.pisaaksidb.model.JavaNilai;
import com.ursabyte.pisaaksidb.model.JavaNilaiApi;
import com.ursabyte.pisaaksidb.service.JavaMahasiswaService;
import com.ursabyte.pisaaksidb.service.JavaMatkulService;
import com.ursabyte.pisaaksidb.service.JavaNilaiService;

@Controller
@RequestMapping(value = "mahasiswa")
public class JavaMahasiswaController {
	
	private JavaNilaiService javaNilaiService;
	private JavaMatkulService javaMatkulService;
	private JavaMahasiswaService javaMahasiswaService;
	
	@RequestMapping(value = "view")
	public ModelAndView viewNilai(){
		ModelAndView mv = new ModelAndView("viewMahasiswa");
		
		return mv;
	}
	
	@RequestMapping(value = "save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ReturnData saveData(@RequestBody JavaNilaiApi jna,
			HttpServletRequest request) {
		ReturnData rd = new ReturnData();
		
		JavaNilai jn = new JavaNilai();
		String nm = jna.getNama();
		String nmMatkul = jna.getMatkul();
		
		JavaMahasiswa jm = javaMahasiswaService.getbyUsername(nm);
		JavaMatkul jmk = javaMatkulService.getbyNamaMatkul(nmMatkul);
		
		jn.setNim(jm.getNim());
		jn.setKode_mk(jmk.getKode_mk());
		int nil = jna.getNilai();
		
		//kondisi Untuk Mencari Index nilai
		if(nil>=80){
			jn.setIndex_nilai("A");
		}else if(80>nil && nil>=70){
			jn.setIndex_nilai("B");
		}else if(70>nil && nil>=60){
			jn.setIndex_nilai("C");
		}else if(60>nil && nil>=50){
			jn.setIndex_nilai("D");
		}else if(nil<50){
			jn.setIndex_nilai("E");
		}
		
		//simpan data ke DB
		javaNilaiService.saveNilai(jn);
		
		rd.setSuccess(true);
		rd.setMessage("OK");

		return rd;
	}
}
