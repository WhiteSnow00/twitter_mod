import java.io.IOException;
import java.util.zip.ZipFile;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l7z implements aiz
{
    public final wyz a;
    public final Set b;
    public final AtomicBoolean c;
    public final brz d;
    
    public l7z(final brz d, final wyz a, final Set b, final AtomicBoolean c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final ZipFile zipFile, final Set<foz> set) throws IOException {
        this.d.c(this.a, (Set)set, (glz)new y2z(this));
    }
}
