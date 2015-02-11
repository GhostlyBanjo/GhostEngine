package net.ge.src.Entities;

import net.ge.src.util.Pair;

/**
 * Created by s613271 on 2/9/2015.
 */
public interface WorldObject {

    public Pair<Float, Float> getSize();
    public Pair<Float, Float> getLocation();
    public String name();

}
