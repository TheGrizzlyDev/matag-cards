package com.matag.cards;

import lombok.SneakyThrows;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Component;

@Component
public class ResourceLoader {

  @SneakyThrows
  public Resource[] getCardsFileNames() {
    return new PathMatchingResourcePatternResolver(this.getClass().getClassLoader())
        .getResources("/cards/*");
  }

  @SneakyThrows
  public Resource[] getSetsFileNames() {
    return new PathMatchingResourcePatternResolver(this.getClass().getClassLoader())
        .getResources("/sets/*");
  }
}
