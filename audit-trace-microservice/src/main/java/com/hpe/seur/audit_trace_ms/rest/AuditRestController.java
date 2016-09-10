package com.hpe.seur.audit_trace_ms.rest;

//import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hpe.seur.audit_trace_ms.persistence.AuditRepository;
import com.hpe.seur.audit_trace_ms.persistence.TraceRepository;

import com.hpe.seur.core.lib.audit.AuditDTO;
import com.hpe.seur.core.lib.audit.trace.TraceDTO;

@RestController
@RequestMapping("/audit")
public class AuditRestController {
  
  @Autowired
  private AuditRepository repoAudit;
  
  @Autowired
  private TraceRepository repoTrace;
  
  private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
  
  public AuditRestController() 
  {
	  super();
  }
  
  @RequestMapping(method=RequestMethod.POST)
  public AuditDTO createAudit(@RequestBody AuditDTO audit) 
  {
	  LOGGER.info("Operation - Create Audit Entry - Required");
	  return repoAudit.save(audit);
  }
  
  @RequestMapping(value = "/trace", method=RequestMethod.POST)
  public TraceDTO createTrace(@RequestBody TraceDTO trace) 
  {
	  LOGGER.info("Operation - Create Trace Entry - Required");
	  return repoTrace.save(trace);
  }
  
  /*
  @RequestMapping(method=RequestMethod.GET)
  public List<AuditDTO> getAll() 
  {
	  LOGGER.info("Operation - List - Required");
	  return repo.findAll();
  }
  
  
  
  @RequestMapping(method=RequestMethod.DELETE, value="{id}")
  public void delete(@PathVariable String id) 
  {
	  LOGGER.info("Operation - Delete - Required");
	  repo.delete(id);
  }
  
 @RequestMapping(method=RequestMethod.PUT, value="{id}")
  public AuditDTO update(@PathVariable String id, @RequestBody AuditDTO audit) 
  {
	LOGGER.info("Operation - Update - Required");
	AuditDTO update = repo.findOne(id);
    
   //Processo de copia de campos
	
    return repo.save(update);
  }
   */
}