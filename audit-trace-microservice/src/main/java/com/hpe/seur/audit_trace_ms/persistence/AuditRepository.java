package com.hpe.seur.audit_trace_ms.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hpe.seur.core.lib.audit.AuditDTO;

public interface AuditRepository extends MongoRepository <AuditDTO, String> {}
