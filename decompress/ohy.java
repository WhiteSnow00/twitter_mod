import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ohy
{
    public final ArrayList a;
    
    public ohy() {
        this.a = new ArrayList();
    }
    
    public abstract kfy a(final String p0, final y7z p1, final List p2);
    
    public final kfy b(final String s) {
        if (this.a.contains(vbz.e(s))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(s)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
