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
    public final rbf F0;
    
    public LifecycleCallback(final rbf f0) {
        this.F0 = f0;
    }
    
    public static rbf c(final abf abf) {
        final Activity a = abf.a;
        if (a instanceof dob) {
            final dob dob = (dob)a;
            final WeakHashMap<dob, WeakReference<rty>> f1 = rty.F1;
            final WeakReference weakReference = f1.get(dob);
            rty rty = null;
            if (weakReference != null) {
                if ((rty = (rty)weakReference.get()) != null) {
                    return rty;
                }
            }
            try {
                final rty rty2 = (rty)dob.P().H("SupportLifecycleFragmentImpl");
                Label_0108: {
                    if (rty2 != null) {
                        rty = rty2;
                        if (!rty2.R0) {
                            break Label_0108;
                        }
                    }
                    rty = new rty();
                    final a a2 = new a(dob.P());
                    a2.e(0, (Fragment)rty, "SupportLifecycleFragmentImpl", 1);
                    a2.j();
                }
                f1.put(dob, new WeakReference<rty>(rty));
                return rty;
            }
            catch (final ClassCastException ex) {
                throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", ex);
            }
        }
        if (a instanceof Activity) {
            final WeakHashMap<Activity, WeakReference<njy>> i0 = njy.I0;
            final WeakReference weakReference2 = i0.get(a);
            njy njy = null;
            if (weakReference2 != null) {
                if ((njy = (njy)weakReference2.get()) != null) {
                    return njy;
                }
            }
            try {
                final njy njy2 = (njy)a.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                Label_0225: {
                    if (njy2 != null) {
                        njy = njy2;
                        if (!njy2.isRemoving()) {
                            break Label_0225;
                        }
                    }
                    njy = new njy();
                    a.getFragmentManager().beginTransaction().add((android.app.Fragment)njy, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                i0.put(a, new WeakReference<njy>(njy));
                return njy;
            }
            catch (final ClassCastException ex2) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", ex2);
            }
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
    
    @Keep
    private static rbf getChimeraLifecycleFragmentImpl(final abf abf) {
        throw new IllegalStateException("Method not available in SDK.");
    }
    
    public void a(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
    }
    
    public final Activity b() {
        final Activity o0 = this.F0.o0();
        iuk.C((Object)o0);
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
