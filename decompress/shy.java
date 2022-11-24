import java.util.List;
import java.util.Iterator;
import android.os.BaseBundle;
import java.util.Map;
import com.google.android.play.core.assetpacks.AssetPackException;
import java.util.ArrayList;
import android.os.Bundle;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class shy implements w100
{
    public static final h4a g;
    public static final Intent h;
    public final String a;
    public final mry b;
    public final wyy c;
    public tgy<yzz> d;
    public tgy<yzz> e;
    public final AtomicBoolean f;
    
    static {
        g = new h4a("AssetPackServiceImpl");
        h = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");
    }
    
    public shy(Context context, final mry b, final wyy c) {
        this.f = new AtomicBoolean();
        this.a = context.getPackageName();
        this.b = b;
        this.c = c;
        if (jqy.b(context)) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            final h4a g = shy.g;
            final Intent h = shy.h;
            final qds m0 = qds.M0;
            this.d = new tgy<yzz>(applicationContext, g, "AssetPackService", h, (cfy)m0);
            final Context applicationContext2 = context.getApplicationContext();
            if (applicationContext2 != null) {
                context = applicationContext2;
            }
            this.e = new tgy<yzz>(context, g, "AssetPackService-keepAlive", h, (cfy)m0);
        }
        shy.g.i("AssetPackService initiated.", new Object[0]);
    }
    
    public static Bundle g() {
        final Bundle t = m58.t("playcore_version_code", 11002);
        final ArrayList list = new ArrayList();
        list.add(0);
        final Integer value = 1;
        list.add(value);
        t.putIntegerArrayList("supported_compression_formats", list);
        final ArrayList list2 = new ArrayList();
        list2.add(value);
        list2.add(2);
        t.putIntegerArrayList("supported_patch_formats", list2);
        return t;
    }
    
    public static <T> crz h() {
        shy.g.j("onError(%d)", -11);
        return llg.h((Exception)new AssetPackException(-11));
    }
    
    public static Bundle k(final int n, final String s, final String s2, final int n2) {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt("session_id", n);
        ((BaseBundle)bundle).putString("module_name", s);
        ((BaseBundle)bundle).putString("slice_id", s2);
        ((BaseBundle)bundle).putInt("chunk_number", n2);
        return bundle;
    }
    
    public static /* bridge */ Bundle l(final Map map) {
        final Bundle g = g();
        final ArrayList list = new ArrayList();
        for (final Map.Entry<K, Long> entry : map.entrySet()) {
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putString("installed_asset_module_name", (String)entry.getKey());
            ((BaseBundle)bundle).putLong("installed_asset_module_version", (long)entry.getValue());
            list.add(bundle);
        }
        g.putParcelableArrayList("installed_asset_module", list);
        return g;
    }
    
    @Override
    public final void a(final int n, final String s) {
        this.j(n, s, 10);
    }
    
    @Override
    public final crz b(final int n, final String s, final String s2, final int n2) {
        if (this.d == null) {
            return h();
        }
        shy.g.l("getChunkFileDescriptor(%s, %s, %d, session=%d)", s, s2, n2, n);
        final ffz ffz = new ffz();
        this.d.b(new sdy(this, ffz, n, s, s2, n2, ffz), (ffz<?>)ffz);
        return ffz.a;
    }
    
    @Override
    public final void c(final int n) {
        if (this.d != null) {
            shy.g.l("notifySessionFailed", new Object[0]);
            final ffz ffz = new ffz();
            this.d.b(new kdy(this, ffz, n, ffz), (ffz<?>)ffz);
            return;
        }
        throw new vqy("The Play Store app is not installed or is an unofficial version.", n);
    }
    
    @Override
    public final void d(final List<String> list) {
        if (this.d == null) {
            return;
        }
        shy.g.l("cancelDownloads(%s)", list);
        final ffz ffz = new ffz();
        this.d.b((cdy)new coz((Object)this, ffz, (Object)list, ffz, 1), (ffz<?>)ffz);
    }
    
    @Override
    public final void e(final int n, final String s, final String s2, final int n2) {
        if (this.d != null) {
            shy.g.l("notifyChunkTransferred", new Object[0]);
            final ffz ffz = new ffz();
            this.d.b(new ucy(this, ffz, n, s, s2, n2, ffz), (ffz<?>)ffz);
            return;
        }
        throw new vqy("The Play Store app is not installed or is an unofficial version.", n);
    }
    
    @Override
    public final crz f(final Map<String, Long> map) {
        if (this.d == null) {
            return h();
        }
        shy.g.l("syncPacks", new Object[0]);
        final ffz ffz = new ffz();
        this.d.b((cdy)new fcy(this, ffz, (Map)map, ffz), (ffz<?>)ffz);
        return ffz.a;
    }
    
    @Override
    public final void i() {
        synchronized (this) {
            if (this.e == null) {
                shy.g.m("Keep alive connection manager is not initialized.", new Object[0]);
                return;
            }
            final h4a g = shy.g;
            g.l("keepAlive", new Object[0]);
            if (!this.f.compareAndSet(false, true)) {
                g.l("Service is already kept alive.", new Object[0]);
                return;
            }
            final ffz ffz = new ffz();
            this.e.b((cdy)new aey(this, ffz, ffz), (ffz<?>)ffz);
        }
    }
    
    public final void j(final int n, final String s, final int n2) {
        if (this.d != null) {
            shy.g.l("notifyModuleCompleted", new Object[0]);
            final ffz ffz = new ffz();
            this.d.b(new bdy(this, ffz, n, s, ffz, n2), (ffz<?>)ffz);
            return;
        }
        throw new vqy("The Play Store app is not installed or is an unofficial version.", n);
    }
}
