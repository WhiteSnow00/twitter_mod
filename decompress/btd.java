import android.os.BaseBundle;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import java.util.List;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.ComponentName;
import android.content.Intent;
import android.os.RemoteException;
import android.os.Bundle;
import android.content.ServiceConnection;
import android.support.annotation.NonNull;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class btd extends atd
{
    public int a;
    public final Context b;
    public t2d c;
    public btd.btd$a d;
    
    public btd(@NonNull final Context context) {
        this.a = 0;
        this.b = context.getApplicationContext();
    }
    
    @Override
    public final void a() {
        this.a = 3;
        if (this.d != null) {
            h6q.J("Unbinding from service.");
            this.b.unbindService((ServiceConnection)this.d);
            this.d = null;
        }
        this.c = null;
    }
    
    @Override
    public final zng b() throws RemoteException {
        if (this.a == 2 && this.c != null && this.d != null) {
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putString("package_name", this.b.getPackageName());
            try {
                return new zng(this.c.d0(bundle));
            }
            catch (final RemoteException ex) {
                h6q.K("RemoteException getting install referrer information");
                this.a = 0;
                throw ex;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }
    
    @Override
    public final void c(@NonNull final ctd ctd) {
        final int a = this.a;
        if (a == 2 && this.c != null && this.d != null) {
            h6q.J("Service connection is valid. No need to re-initialize.");
            ((ftd)ctd).a(0);
            return;
        }
        if (a == 1) {
            h6q.K("Client is already in the process of connecting to the service.");
            ((ftd)ctd).a(3);
            return;
        }
        if (a == 3) {
            h6q.K("Client was already closed and can't be reused. Please create another instance.");
            ((ftd)ctd).a(3);
            return;
        }
        h6q.J("Starting install referrer service setup.");
        this.d = new btd.btd$a(this, ctd);
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        final List queryIntentServices = this.b.getPackageManager().queryIntentServices(intent, 0);
        Label_0325: {
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                break Label_0325;
            }
            final ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            if (serviceInfo == null) {
                break Label_0325;
            }
            final String packageName = serviceInfo.packageName;
            final String name = serviceInfo.name;
            Label_0306: {
                if (!"com.android.vending".equals(packageName) || name == null) {
                    break Label_0306;
                }
                final PackageManager packageManager = this.b.getPackageManager();
                while (true) {
                    try {
                        boolean b;
                        if (packageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                            b = true;
                        }
                        else {
                            b = false;
                        }
                        if (!b) {
                            h6q.K("Play Store missing or incompatible. Version 8.3.73 or later required.");
                            this.a = 0;
                            ((ftd)ctd).a(2);
                            return;
                        }
                        intent = new Intent(intent);
                        if (this.b.bindService(intent, (ServiceConnection)this.d, 1)) {
                            h6q.J("Service was bonded successfully.");
                            return;
                        }
                        h6q.K("Connection to service is blocked.");
                        this.a = 0;
                        ((ftd)ctd).a(1);
                        return;
                        this.a = 0;
                        h6q.J("Install Referrer service unavailable on device.");
                        ((ftd)ctd).a(2);
                    }
                    catch (final PackageManager$NameNotFoundException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
}
