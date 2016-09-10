package com.hpe.seur.audit_trace_ms.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hpe.seur.core.lib.audit.trace.TraceDTO;

public interface TraceRepository extends MongoRepository <TraceDTO, String> {}