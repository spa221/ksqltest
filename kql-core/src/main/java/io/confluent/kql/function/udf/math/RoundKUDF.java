/**
 * Copyright 2017 Confluent Inc.
 **/

package io.confluent.kql.function.udf.math;

import io.confluent.kql.function.KQLFunctionException;
import io.confluent.kql.function.udf.KUDF;

public class RoundKUDF implements KUDF {

  @Override
  public void init() {
  }

  @Override
  public Object evaluate(Object... args) {
    if (args.length != 1) {
      throw new KQLFunctionException("Len udf should have one input argument.");
    }
    return Math.round((Double) args[0]);
  }
}