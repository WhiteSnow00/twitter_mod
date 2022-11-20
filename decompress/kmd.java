import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kmd
{
    public final ArrayList a;
    
    public kmd() {
        this.a = new ArrayList();
    }
    
    public final int a(final String s) {
        this.a.add(s);
        return this.a.size() - 1;
    }
}
