// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.analytics.tracking;

import com.android.vending.licensing.a$a;
import android.os.IInterface;
import com.android.vending.licensing.ILicensingService$a$a;
import com.android.vending.licensing.ILicensingService$a;
import android.os.IBinder;
import android.content.ComponentName;
import android.os.RemoteException;
import com.android.vending.licensing.a;
import java.util.Locale;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.content.Context;
import com.android.vending.licensing.ILicensingService;
import java.security.SecureRandom;
import android.content.ServiceConnection;

public final class f implements ServiceConnection
{
    public static final SecureRandom H0;
    public ILicensingService D0;
    public final Context E0;
    public final e.a F0;
    public final String G0;
    
    static {
        H0 = new SecureRandom();
    }
    
    public f(final Context e0, final e.a f0) {
        final HandlerThread handlerThread = new HandlerThread("license_checker");
        ((Thread)handlerThread).start();
        this.E0 = e0;
        this.G0 = e0.getPackageName();
        new Handler(handlerThread.getLooper());
        this.F0 = f0;
    }
    
    public final void a() {
        synchronized (this) {
            final ILicensingService d0 = this.D0;
            if (d0 == null) {
                try {
                    if (!this.E0.bindService(new Intent("com.android.vending.licensing.ILicensingService").setPackage("com.android.vending"), (ServiceConnection)this, 1)) {
                        this.F0.a(-1, "Binding failed", "");
                    }
                }
                catch (final SecurityException ex) {
                    this.F0.a(-1, String.format(Locale.ENGLISH, "Exception: %s, Message: %s", ex, ex.getMessage()), "");
                }
            }
            else {
                try {
                    d0.F0((long)f.H0.nextInt(), this.G0, (com.android.vending.licensing.a)new a());
                }
                catch (final RemoteException ex2) {
                    this.F0.a(-1, String.format(Locale.ENGLISH, "Exception: %s, Message: %s", ex2, ((Throwable)ex2).getMessage()), "");
                }
            }
        }
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        synchronized (this) {
            final int a = ILicensingService$a.a;
            Object d0 = null;
            if (binder != null) {
                final IInterface queryLocalInterface = binder.queryLocalInterface("com.android.vending.licensing.ILicensingService");
                if (queryLocalInterface != null && queryLocalInterface instanceof ILicensingService) {
                    d0 = queryLocalInterface;
                }
                else {
                    d0 = new ILicensingService$a$a(binder);
                }
            }
            this.D0 = (ILicensingService)d0;
            try {
                ((ILicensingService)d0).F0((long)f.H0.nextInt(), this.G0, (com.android.vending.licensing.a)new a());
            }
            catch (final RemoteException ex) {
                this.F0.a(-1, ex.toString(), "");
            }
        }
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        synchronized (this) {
            this.D0 = null;
        }
    }
    
    public final class a extends a$a
    {
        public final f a;
        
        public a(final f a) {
            this.a = a;
        }
    }
}
