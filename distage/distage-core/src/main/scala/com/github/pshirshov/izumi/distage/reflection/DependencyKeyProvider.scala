package com.github.pshirshov.izumi.distage.reflection

import com.github.pshirshov.izumi.distage.model.DIKey
import com.github.pshirshov.izumi.distage.reflection.DependencyContext.{MethodContext, ParameterContext}
import com.github.pshirshov.izumi.distage.{MethodSymb, TypeFull, TypeSymb}


trait DependencyKeyProvider {
  def keyFromParameter(context: ParameterContext, parameterSymbol: TypeSymb): DIKey

  def keyFromMethod(context: MethodContext, methodSymbol: MethodSymb): DIKey

  def keyFromType(parameterSymbol: TypeFull): DIKey
}
