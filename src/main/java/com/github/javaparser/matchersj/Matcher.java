package com.github.javaparser.matchersj;

import com.github.javaparser.ast.Node;

/**
 * Created by djc3 on 6/13/17.
 */
public interface Matcher<N extends Node> {

    public MatchResult<N> match(Node node, MatchContext matchContext);

}