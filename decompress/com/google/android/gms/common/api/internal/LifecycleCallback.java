// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.content.Intent;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import androidx.annotation.Keep;
import java.util.WeakHashMap;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import java.lang.ref.WeakReference;

public class LifecycleCallback
{
    public final vaf D0;
    
    public LifecycleCallback(final vaf d0) {
        this.D0 = d0;
    }
    
    public static vaf c(final daf daf) {
        final Activity a = daf.a;
        if (a instanceof cnb) {
            final cnb cnb = (cnb)a;
            final WeakHashMap d1 = usy.D1;
            final WeakReference weakReference = d1.get(cnb);
            Object o = null;
            if (weakReference != null) {
                if ((o = weakReference.get()) != null) {
                    return (vaf)o;
                }
            }
            try {
                final usy usy = (usy)cnb.P().H("SupportLifecycleFragmentImpl");
                Label_0108: {
                    if (usy != null) {
                        o = usy;
                        if (!((Fragment)usy).P0) {
                            break Label_0108;
                        }
                    }
                    o = new usy();
                    final a a2 = new a(cnb.P());
                    a2.e(0, (Fragment)o, "SupportLifecycleFragmentImpl", 1);
                    a2.j();
                }
                d1.put(cnb, new WeakReference(o));
                return (vaf)o;
            }
            catch (final ClassCastException ex) {
                throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", ex);
            }
        }
        if (a instanceof Activity) {
            final WeakHashMap g0 = tiy.G0;
            final WeakReference weakReference2 = g0.get(a);
            Object o2 = null;
            if (weakReference2 != null) {
                if ((o2 = weakReference2.get()) != null) {
                    return (vaf)o2;
                }
            }
            try {
                final tiy tiy = (tiy)a.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                Label_0225: {
                    if (tiy != null) {
                        o2 = tiy;
                        if (!((android.app.Fragment)tiy).isRemoving()) {
                            break Label_0225;
                        }
                    }
                    o2 = new tiy();
                    a.getFragmentManager().beginTransaction().add((android.app.Fragment)o2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                g0.put(a, new WeakReference(o2));
                return (vaf)o2;
            }
            catch (final ClassCastException ex2) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", ex2);
            }
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
    
    @Keep
    private static vaf getChimeraLifecycleFragmentImpl(final daf daf) {
        throw new IllegalStateException("Method not available in SDK.");
    }
    
    public void a(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
    }
    
    public final Activity b() {
        final Activity o0 = this.D0.o0();
        eli.q(o0);
        return o0;
    }
    
    public void d(final int n, final int n2, final Intent intent) {
    }
    
    public void e(final Bundle bundle) {
    }
    
    public void f() {
    }
    
    public void g(final Bundle bundle) {
    }
    
    public void h() {
    }
    
    public void i() {
    }
}
