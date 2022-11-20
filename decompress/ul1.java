import java.util.Iterator;
import android.view.MenuItem;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;
import androidx.activity.ComponentActivity$c;
import android.os.Bundle;
import android.content.res.Resources;
import android.content.Intent;
import android.os.Build$VERSION;
import android.content.res.AssetManager;
import androidx.fragment.app.p;
import java.util.LinkedHashMap;
import android.view.LayoutInflater;
import android.content.Context;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import java.util.Map;
import android.content.res.Configuration;
import androidx.appcompat.app.f;

// 
// Decompiled by Procyon v0.6.0
// 

public class ul1 extends f implements faf, ndc, jtm, acc, fdc
{
    public static final ul1.ul1$a Companion;
    public final wc6 W0;
    public final wc6 X0;
    public final sz5 Y0;
    public final in$a Z0;
    public final yba<Configuration> a1;
    public final yba<bo> b1;
    public final yba<of1> c1;
    public final yba<lmd> d1;
    public final yba<q4h> e1;
    public final yba<y6k> f1;
    public final lve g1;
    public final lob h1;
    public final Map<String, Object> i1;
    public boolean j1;
    public boolean k1;
    public boolean l1;
    public UserIdentifier m1;
    
    static {
        Companion = new ul1.ul1$a();
    }
    
    public ul1() {
        this.W0 = new wc6();
        this.X0 = new wc6();
        final sz5 y0 = new sz5();
        this.Y0 = y0;
        Objects.requireNonNull(in.Companion);
        this.Z0 = new in$a();
        final xbm$b companion = xbm.Companion;
        this.a1 = (yba<Configuration>)new yba((z9a)companion.a((sy5)y0), false);
        this.b1 = (yba<bo>)new yba((z9a)companion.a((sy5)y0), false);
        this.c1 = (yba<of1>)new yba((z9a)companion.a((sy5)y0), false);
        this.d1 = (yba<lmd>)new yba((z9a)companion.a((sy5)y0), false);
        this.e1 = (yba<q4h>)new yba((z9a)companion.a((sy5)y0), false);
        this.f1 = (yba<y6k>)new yba((z9a)companion.a((sy5)y0), false);
        this.g1 = new lve((Context)this, (LayoutInflater)new lsh((Context)this, (nsb)new jsh((Context)this), (Iterable)f2a.D0, (nsb)ksh.D0, 1), (dml)new tl1(this));
        final p p = ((cnb)this).P();
        czd.e((Object)p, "supportFragmentManager");
        this.h1 = new lob(p);
        this.i1 = new LinkedHashMap();
        this.m1 = UserIdentifier.UNDEFINED;
    }
    
    public static LayoutInflater c0(final ul1 ul1) {
        czd.f((Object)ul1, "this$0");
        final Object systemService = ((Activity)ul1).getSystemService("layout_inflater");
        czd.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        return (LayoutInflater)systemService;
    }
    
    public final xba<lmd> A0() {
        return (xba<lmd>)this.d1;
    }
    
    public final xba<y6k> D() {
        return (xba<y6k>)this.f1;
    }
    
    public final <T> T D0(final String s) {
        return this.i1.get(s);
    }
    
    public final xba<q4h> G0() {
        return (xba<q4h>)this.e1;
    }
    
    public final Object I() {
        this.v("retainedFragmentState", this.h1.m0());
        return this.i1;
    }
    
    public final xba<of1> J() {
        return (xba<of1>)this.c1;
    }
    
    public final void K(final fn fn) {
        final in$a z0 = this.Z0;
        Objects.requireNonNull(z0);
        cj1.f();
        z0.a.add(fn);
    }
    
    public final boolean Y() {
        return this.j1 && !((Activity)this).isFinishing();
    }
    
    public final void attachBaseContext(final Context context) {
        czd.f((Object)context, "newBase");
        super.attachBaseContext(m5s.e(context));
        if (!fes.c) {
            j2r.b((Context)this);
        }
    }
    
    public final void c(final Map<String, ?> map) {
        this.i1.clear();
        if (map != null) {
            this.i1.putAll(map);
            final lob h1 = this.h1;
            final Map map2 = this.i1.get("retainedFragmentState");
            h1.E0.clear();
            if (map2 != null) {
                h1.E0.putAll(map2);
            }
        }
    }
    
    public final AssetManager getAssets() {
        AssetManager assetManager;
        if (Build$VERSION.SDK_INT > 21) {
            assetManager = super.getAssets();
        }
        else {
            assetManager = this.getResources().getAssets();
        }
        return assetManager;
    }
    
    public final LayoutInflater getLayoutInflater() {
        final LayoutInflater a = this.g1.a();
        czd.e((Object)a, "layoutInflaterProvider.get()");
        return a;
    }
    
    public final Object getSystemService(final String s) {
        czd.f((Object)s, "name");
        Object o;
        if (czd.a((Object)s, (Object)"layout_inflater")) {
            o = this.g1.a();
            czd.e(o, "layoutInflaterProvider.get()");
            wk0.b().a();
        }
        else {
            o = super.getSystemService(s);
        }
        return o;
    }
    
    public final boolean isDestroyed() {
        return this.l1;
    }
    
    public final boolean j() {
        return this.k1;
    }
    
    public final Map<String, Object> m0() {
        this.v("retainedFragmentState", this.h1.m0());
        return this.i1;
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        this.b1.e((Object)new bo(n, n2, intent));
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((Activity)this).getWindow().setFormat(1);
    }
    
    public void onBackPressed() {
        this.c1.e((Object)of1.a);
        super.onBackPressed();
    }
    
    public final void onConfigurationChanged(Configuration configuration) {
        czd.f((Object)configuration, "newConfig");
        configuration = new Configuration(configuration);
        this.getResources().updateConfiguration(configuration, Resources.getSystem().getDisplayMetrics());
        super.onConfigurationChanged(configuration);
        this.a1.e((Object)configuration);
    }
    
    public void onCreate(final Bundle bundle) {
        UserIdentifier m1 = xi1.fromIntent(((Activity)this).getIntent()).getOwner();
        czd.e((Object)m1, "fromIntent(intent).owner");
        if (!m1.isDefined()) {
            m1 = UserIdentifier.Companion.c();
        }
        this.m1 = m1;
        final ComponentActivity$c componentActivity$c = (ComponentActivity$c)((Activity)this).getLastNonConfigurationInstance();
        Object a;
        if (componentActivity$c != null) {
            a = componentActivity$c.a;
        }
        else {
            a = null;
        }
        this.c((Map<String, ?>)a);
        super.onCreate(bundle);
    }
    
    public boolean onCreateOptionsMenu(final Menu menu) {
        czd.f((Object)menu, "menu");
        this.e1.e((Object)new q4h$a(menu));
        return super.onCreateOptionsMenu(menu);
    }
    
    public final void onDestroy() {
        this.X0.dispose();
        this.l1 = true;
        super.onDestroy();
        this.Y0.onComplete();
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        czd.f((Object)keyEvent, "event");
        this.d1.e((Object)new jpe(keyEvent));
        return super.onKeyDown(n, keyEvent);
    }
    
    public boolean onKeyLongPress(final int n, final KeyEvent keyEvent) {
        czd.f((Object)keyEvent, "event");
        this.d1.e((Object)new upe(keyEvent));
        return super.onKeyLongPress(n, keyEvent);
    }
    
    public boolean onKeyMultiple(final int n, final int n2, final KeyEvent keyEvent) {
        czd.f((Object)keyEvent, "event");
        this.d1.e((Object)new zpe(keyEvent));
        return super.onKeyMultiple(n, n2, keyEvent);
    }
    
    public boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        czd.f((Object)keyEvent, "event");
        this.d1.e((Object)new jqe(keyEvent));
        return super.onKeyUp(n, keyEvent);
    }
    
    public final boolean onMenuOpened(final int n, final Menu menu) {
        czd.f((Object)menu, "menu");
        this.e1.e((Object)new q4h$c(menu));
        return super.onMenuOpened(n, menu);
    }
    
    public void onNewIntent(final Intent intent) {
        czd.f((Object)intent, "intent");
        this.Z0.a((Activity)this, intent);
        super.onNewIntent(intent);
    }
    
    public final boolean onOptionsItemSelected(final MenuItem menuItem) {
        czd.f((Object)menuItem, "item");
        this.e1.e((Object)new q4h$b(menuItem));
        return super.onOptionsItemSelected(menuItem);
    }
    
    public final void onPause() {
        this.k1 = false;
        super.onPause();
        this.W0.dispose();
    }
    
    public final boolean onPrepareOptionsMenu(final Menu menu) {
        czd.f((Object)menu, "menu");
        this.e1.e((Object)new q4h$d(menu));
        return super.onPrepareOptionsMenu(menu);
    }
    
    public final void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        czd.f((Object)array, "permissions");
        czd.f((Object)array2, "grantResults");
        g7k.d().h((Activity)this, array);
        this.f1.e((Object)y6k.Companion.a(n, array, array2));
        super.onRequestPermissionsResult(n, array, array2);
    }
    
    public void onResume() {
        super.onResume();
        this.k1 = true;
    }
    
    public void onStart() {
        super.onStart();
        this.j1 = true;
    }
    
    public final void onStop() {
        this.j1 = false;
        super.onStop();
    }
    
    public final void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        final in$a z0 = this.Z0;
        Objects.requireNonNull(z0);
        cj1.f();
        final Iterator iterator = z0.a.iterator();
        while (iterator.hasNext()) {
            ((fn)iterator.next()).b((Activity)this, b);
        }
    }
    
    public final UserIdentifier q() {
        return this.m1;
    }
    
    public final xba<Configuration> u() {
        return (xba<Configuration>)this.a1;
    }
    
    public final Object v(final String s, final Object o) {
        Object o2;
        if (o != null) {
            o2 = this.i1.put(s, o);
        }
        else {
            o2 = this.i1.remove(s);
        }
        return o2;
    }
    
    public final xba<bo> z() {
        return (xba<bo>)this.b1;
    }
}
