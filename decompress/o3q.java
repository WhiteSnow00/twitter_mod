import java.util.concurrent.Future;
import android.os.PersistableBundle;
import android.graphics.Bitmap;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Set;
import java.util.Iterator;
import java.util.concurrent.Executor;
import android.text.TextUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import android.content.Intent;
import java.io.File;
import java.util.UUID;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o3q implements Runnable
{
    public final List D0;
    public final qqm E0;
    public final l3q F0;
    
    public o3q(final l3q f0, final List d0, final qqm e0) {
        this.F0 = f0;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final void run() {
        for (final j3q j3q : this.D0) {
            final Set k = j3q.k;
            if (k != null) {
                if (k.isEmpty()) {
                    continue;
                }
                final l3q f0 = this.F0;
                Objects.requireNonNull(f0);
                final IconCompat h = j3q.h;
                final Bitmap bitmap = null;
                String resourceName = null;
                String absolutePath = null;
                Label_0151: {
                    Label_0147: {
                        if (h != null) {
                            final int j = h.j();
                            if (j != 1) {
                                if (j == 2) {
                                    resourceName = f0.a.getResources().getResourceName(h.g());
                                    absolutePath = null;
                                    break Label_0151;
                                }
                                if (j != 5) {
                                    break Label_0147;
                                }
                            }
                            absolutePath = new File(f0.g, UUID.randomUUID().toString()).getAbsolutePath();
                            resourceName = null;
                            break Label_0151;
                        }
                    }
                    resourceName = null;
                    absolutePath = null;
                }
                final j3q j3q2 = new j3q();
                j3q2.a = j3q.a;
                j3q2.b = j3q.b;
                final Intent[] c = j3q.c;
                j3q2.c = Arrays.copyOf(c, c.length);
                j3q2.d = j3q.d;
                j3q2.e = j3q.e;
                j3q2.f = j3q.f;
                j3q2.g = j3q.g;
                j3q2.h = j3q.h;
                j3q2.i = j3q.i;
                j3q2.l = j3q.l;
                j3q2.m = j3q.m;
                j3q2.n = j3q.n;
                final hbk[] i = j3q.j;
                if (i != null) {
                    j3q2.j = Arrays.copyOf(i, i.length);
                }
                if (j3q.k != null) {
                    j3q2.k = new HashSet(j3q.k);
                }
                final PersistableBundle o = j3q.o;
                if (o != null) {
                    j3q2.o = o;
                }
                j3q2.p = j3q.p;
                j3q2.h = null;
                if (TextUtils.isEmpty(j3q2.e)) {
                    throw new IllegalArgumentException("Shortcut must have a non-empty label");
                }
                final Intent[] c2 = j3q2.c;
                if (c2 == null || c2.length == 0) {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                final s3q$a s3q$a = new s3q$a(j3q2, resourceName, absolutePath);
                final IconCompat h2 = j3q.h;
                Bitmap f2 = bitmap;
                if (absolutePath != null) {
                    f2 = h2.f();
                }
                final String b = j3q.b;
                ((d8q<String, s3q$a>)this.F0.b).put(b, s3q$a);
                if (f2 == null) {
                    continue;
                }
                final l3q f3 = this.F0;
                Objects.requireNonNull(f3);
                final p3q p3q = new p3q(f3, f2, absolutePath);
                final qqm qqm = new qqm();
                f3.e.submit(new q3q(qqm, (Runnable)p3q));
                final smf smf = ((d8q<String, smf>)this.F0.c).put(b, (smf)qqm);
                if (smf != null) {
                    ((Future)smf).cancel(false);
                }
                ((qd)qqm).e((Runnable)new Runnable(this, b, qqm) {
                    public final String D0;
                    public final smf E0;
                    public final o3q F0;
                    
                    @Override
                    public final void run() {
                        ((d8q<Object, Object>)this.F0.F0.c).remove(this.D0);
                        if (((Future)this.E0).isCancelled()) {
                            return;
                        }
                        try {
                            ((Future<Object>)this.E0).get();
                        }
                        catch (final Exception ex) {
                            this.F0.E0.o((Throwable)ex);
                        }
                    }
                }, (Executor)this.F0.d);
            }
        }
        this.F0.h(this.E0);
    }
}
