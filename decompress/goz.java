import java.util.Set;
import android.content.IntentSender$SendIntentException;
import android.app.Activity;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class goz implements l3r
{
    public final nry<way> a;
    public final nry<isa> b;
    public final nry<File> c;
    
    public goz(final nry<way> a, final nry<isa> b, final nry<File> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean a(final n3r n3r, final Activity activity) throws IntentSender$SendIntentException {
        return this.g().a(n3r, activity);
    }
    
    public final void b(final o3r o3r) {
        this.g().b(o3r);
    }
    
    public final void c(final o3r o3r) {
        this.g().c(o3r);
    }
    
    public final Set<String> d() {
        return this.g().d();
    }
    
    public final crz e(final m3r m3r) {
        return this.g().e(m3r);
    }
    
    public final Set<String> f() {
        return this.g().f();
    }
    
    public final l3r g() {
        l3r l3r;
        if (this.c.a() == null) {
            l3r = (l3r)this.a.a();
        }
        else {
            l3r = (l3r)this.b.a();
        }
        return l3r;
    }
}
