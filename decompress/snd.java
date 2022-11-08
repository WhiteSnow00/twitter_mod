import android.view.KeyEvent;
import android.view.Menu;
import android.app.Activity;
import android.os.Bundle;
import com.twitter.app.common.inject.retained.RetainedObjectGraph;
import com.twitter.app.common.inject.view.ViewObjectGraph;

// 
// Decompiled by Procyon v0.6.0
// 

public class snd extends yl1 implements t2e, mdc
{
    public final nn<snd> m1;
    
    public snd() {
        this.m1 = (nn<snd>)new nn((koo)null, 3);
    }
    
    public final void E() {
        super.onBackPressed();
    }
    
    public void a() {
        super.finish();
    }
    
    public final aod b1() {
        return (aod)this.m1;
    }
    
    public final void finish() {
        super.finish();
    }
    
    public final boolean g() {
        return ((z9)this.b1()).g();
    }
    
    public final z7x i() {
        return this.v0().i();
    }
    
    public final ViewObjectGraph n() {
        return ((z9)this.b1()).n();
    }
    
    public final RetainedObjectGraph o() {
        return ((z9)this.b1()).o();
    }
    
    public final void onBackPressed() {
        this.v0().h().j();
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.m1.e((Activity)this, (rsm)this, bundle);
    }
    
    public final boolean onCreateOptionsMenu(final Menu menu) {
        zzd.f((Object)menu, "menu");
        if (jhd.g((t2e)this)) {
            final fbi fbi = (fbi)p88.c((mec)this, (Class)fbi.class);
            final z9i f2 = fbi.f2();
            if (f2 != null) {
                final gai p = fbi.p6();
                if (p != null) {
                    if (f2.l(p, menu)) {
                        final cbi v5 = fbi.v5();
                        if (v5 != null) {
                            f2.i(v5);
                        }
                    }
                    super.d1.e((Object)new p4h.a(menu));
                    return f2.g();
                }
            }
        }
        return super.onCreateOptionsMenu(menu);
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        zzd.f((Object)keyEvent, "event");
        final gqe j2 = ((hqe)p88.c((mec)this, (Class)hqe.class)).j2();
        final boolean b = false;
        if (j2 == null || !j2.b(keyEvent)) {
            final boolean b2 = b;
            if (!super.onKeyDown(n, keyEvent)) {
                return b2;
            }
        }
        return true;
    }
    
    public final boolean onKeyLongPress(final int n, final KeyEvent keyEvent) {
        zzd.f((Object)keyEvent, "event");
        final gqe j2 = ((hqe)p88.c((mec)this, (Class)hqe.class)).j2();
        final boolean b = false;
        if (j2 == null || !j2.c(keyEvent)) {
            final boolean b2 = b;
            if (!super.onKeyLongPress(n, keyEvent)) {
                return b2;
            }
        }
        return true;
    }
    
    public final boolean onKeyMultiple(final int n, final int n2, final KeyEvent keyEvent) {
        zzd.f((Object)keyEvent, "event");
        final gqe j2 = ((hqe)p88.c((mec)this, (Class)hqe.class)).j2();
        final boolean b = false;
        if (j2 == null || !j2.d(keyEvent)) {
            final boolean b2 = b;
            if (!super.onKeyMultiple(n, n2, keyEvent)) {
                return b2;
            }
        }
        return true;
    }
    
    public final boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        zzd.f((Object)keyEvent, "event");
        final gqe j2 = ((hqe)p88.c((mec)this, (Class)hqe.class)).j2();
        final boolean b = false;
        if (j2 == null || !j2.a(keyEvent)) {
            final boolean b2 = b;
            if (!super.onKeyUp(n, keyEvent)) {
                return b2;
            }
        }
        return true;
    }
    
    public final boolean onSearchRequested() {
        final r6p m3 = ((s6p)p88.c((mec)this, (Class)s6p.class)).M3();
        final boolean b = false;
        if (m3 == null || !m3.onSearchRequested()) {
            final boolean b2 = b;
            if (!super.onSearchRequested()) {
                return b2;
            }
        }
        return true;
    }
    
    public final void onTitleChanged(final CharSequence charSequence, final int n) {
        if (jhd.g((t2e)this)) {
            final z9i f2 = ((fbi)p88.c((mec)this, (Class)fbi.class)).f2();
            boolean b = true;
            Label_0061: {
                if (f2 != null) {
                    CharSequence title;
                    if (charSequence == null) {
                        title = "";
                    }
                    else {
                        title = charSequence;
                    }
                    if (f2.setTitle(title)) {
                        break Label_0061;
                    }
                }
                b = false;
            }
            if (!b) {
                super.onTitleChanged(charSequence, n);
            }
        }
    }
    
    public final t4j t0(final Class clazz) {
        return ((go1)this.o()).B(clazz);
    }
    
    public final hl8 v0() {
        return (hl8)this.z0(hl8.class);
    }
    
    public final t4j z0(final Class clazz) {
        return ((go1)this.n()).B(clazz);
    }
}
