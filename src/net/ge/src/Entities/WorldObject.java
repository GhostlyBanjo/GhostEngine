package net.ge.src.Entities;

import net.ge.src.util.Pair;

/**
 * Created by s613271 on 2/9/2015.
 */
public interface WorldObject {

    public Pair<Integer,Integer> getSize();
    public Pair<Integer,Integer> getLocation();
    public String name();

}
