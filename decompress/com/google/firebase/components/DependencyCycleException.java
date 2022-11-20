// 
// Decompiled by Procyon v0.6.0
// 

package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

public class DependencyCycleException extends DependencyException
{
    public final List<n06<?>> D0;
    
    public DependencyCycleException(final List<n06<?>> d0) {
        final StringBuilder j = fu8.j("Dependency cycle detected: ");
        j.append(Arrays.toString(d0.toArray()));
        super(j.toString());
        this.D0 = d0;
    }
}
