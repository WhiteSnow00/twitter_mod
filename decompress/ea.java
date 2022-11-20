import java.io.File;
import java.io.FilenameFilter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ea implements FilenameFilter
{
    public final fa a;
    
    public ea(final fa a) {
        this.a = a;
    }
    
    @Override
    public final boolean accept(final File file, final String s) {
        final fa a = this.a;
        czd.f((Object)a, "this$0");
        czd.e((Object)s, "filename");
        return vkr.b0(s, a.g(), false);
    }
}
