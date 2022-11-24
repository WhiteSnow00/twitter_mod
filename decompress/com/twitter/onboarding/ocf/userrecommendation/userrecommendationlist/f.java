// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.onboarding.ocf.userrecommendation.userrecommendationlist;

public abstract class f
{
    public final int a;
    
    public f(final f.f$a f$a) {
        this.a = f$a.a;
    }
    
    public long a() {
        return this.hashCode();
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof f)) {
            return false;
        }
        if (this.a != ((f)o).a) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return o5j.d((long)this.a);
    }
}
