package mg.hei.tdprog3.model;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public abstract class AbstractClass1 {
  private final ConcreteDependance1 concreteDependance1;
  private final ConcreteDependance2 concreteDependance2;
}
