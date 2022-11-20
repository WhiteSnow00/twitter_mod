import java.util.HashMap;
import android.view.MenuItem;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import java.util.Map;
import android.content.res.Configuration;

// 
// Decompiled by Procyon v0.6.0
// 

public class qo1 extends jk0 implements faf, ndc, jtm, acc, fdc
{
    public final wc6 F0;
    public final sz5 G0;
    public final in$a H0;
    public final yba<Configuration> I0;
    public final yba<bo> J0;
    public final yba<y6k> K0;
    public final yba<of1> L0;
    public final yba<lmd> M0;
    public final yba<q4h> N0;
    public final Map<String, Object> O0;
    public UserIdentifier P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    
    public qo1() {
        this.F0 = new wc6();
        final sz5 g0 = new sz5();
        this.G0 = g0;
        final int a = hn.a;
        Objects.requireNonNull(in.Companion);
        this.H0 = new in$a();
        final xbm$b companion = xbm.Companion;
        this.I0 = (yba<Configuration>)new yba((z9a)companion.a((sy5)g0), false);
        this.J0 = (yba<bo>)new yba((z9a)companion.a((sy5)g0), false);
        this.K0 = (yba<y6k>)new yba((z9a)companion.a((sy5)g0), false);
        this.L0 = (yba<of1>)new yba((z9a)companion.a((sy5)g0), false);
        this.M0 = (yba<lmd>)new yba((z9a)companion.a((sy5)g0), false);
        this.N0 = (yba<q4h>)new yba((z9a)companion.a((sy5)g0), false);
        this.O0 = (xth$a)xth.a(0);
        this.P0 = UserIdentifier.UNDEFINED;
    }
    
    public final xba<lmd> A0() {
        return (xba<lmd>)this.M0;
    }
    
    public final xba<y6k> D() {
        return (xba<y6k>)this.K0;
    }
    
    public final <T> T D0(final String s) {
        final T value = ((HashMap<K, T>)this.O0).get(s);
        final int a = c5j.a;
        return value;
    }
    
    public final xba<q4h> G0() {
        return (xba<q4h>)this.N0;
    }
    
    public final xba<of1> J() {
        return (xba<of1>)this.L0;
    }
    
    public final void K(final fn fn) {
        final in$a h0 = this.H0;
        Objects.requireNonNull(h0);
        cj1.f();
        h0.a.add(fn);
    }
    
    public final boolean Y() {
        return this.Q0 && !((Activity)this).isFinishing();
    }
    
    public final void attachBaseContext(final Context context) {
        super.attachBaseContext(m5s.e(context));
        if (!fes.c) {
            j2r.b((Context)this);
        }
    }
    
    public final void c(final Map<String, Object> map) {
        ((HashMap)this.O0).clear();
        if (map != null) {
            final xth$a o0 = this.O0;
            final int a = c5j.a;
            ((HashMap)o0).putAll(map);
        }
    }
    
    public final void d(final t19 t19) {
        this.F0.a(t19);
    }
    
    public final boolean isDestroyed() {
        return this.S0;
    }
    
    public final boolean j() {
        return this.R0;
    }
    
    public final Map<String, Object> m0() {
        return (Map<String, Object>)this.O0;
    }
    
    public final void onActivityResult(final int n, final int n2, final Intent intent) {
        this.J0.e((Object)new bo(n, n2, intent));
        super.onActivityResult(n, n2, intent);
    }
    
    public void onBackPressed() {
        this.L0.e((Object)of1.a);
        super.onBackPressed();
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.I0.e((Object)configuration);
    }
    
    public void onCreate(final Bundle bundle) {
        UserIdentifier p = xi1.fromIntent(((Activity)this).getIntent()).getOwner();
        if (!p.isDefined()) {
            p = UserIdentifier.getCurrent();
        }
        this.P0 = p;
        final Object lastNonConfigurationInstance = ((Activity)this).getLastNonConfigurationInstance();
        final int a = c5j.a;
        final Map map = (Map)lastNonConfigurationInstance;
        ((HashMap)this.O0).clear();
        if (map != null) {
            ((HashMap<Object, Object>)this.O0).putAll(map);
        }
        super.onCreate(bundle);
    }
    
    public boolean onCreateOptionsMenu(final Menu menu) {
        this.N0.e((Object)new q4h$a(menu));
        return super.onCreateOptionsMenu(menu);
    }
    
    public void onDestroy() {
        this.F0.dispose();
        this.S0 = true;
        super.onDestroy();
        this.G0.onComplete();
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        this.M0.e((Object)new jpe(keyEvent));
        return super.onKeyDown(n, keyEvent);
    }
    
    public final boolean onKeyLongPress(final int n, final KeyEvent keyEvent) {
        this.M0.e((Object)new upe(keyEvent));
        return super.onKeyLongPress(n, keyEvent);
    }
    
    public final boolean onKeyMultiple(final int n, final int n2, final KeyEvent keyEvent) {
        this.M0.e((Object)new zpe(keyEvent));
        return super.onKeyMultiple(n, n2, keyEvent);
    }
    
    public final boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        this.M0.e((Object)new jqe(keyEvent));
        return super.onKeyUp(n, keyEvent);
    }
    
    public final void onNewIntent(final Intent intent) {
        this.H0.a((Activity)this, intent);
        super.onNewIntent(intent);
    }
    
    public final boolean onOptionsItemSelected(final MenuItem menuItem) {
        this.N0.e((Object)new q4h$b(menuItem));
        return super.onOptionsItemSelected(menuItem);
    }
    
    public final void onPause() {
        this.R0 = false;
        super.onPause();
    }
    
    public final boolean onPrepareOptionsMenu(final Menu menu) {
        this.N0.e((Object)new q4h$d(menu));
        return super.onPrepareOptionsMenu(menu);
    }
    
    public final void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        g7k.d().h((Activity)this, array);
        this.K0.e((Object)y6k.Companion.a(n, array, array2));
        super.onRequestPermissionsResult(n, array, array2);
    }
    
    public void onResume() {
        super.onResume();
        this.R0 = true;
    }
    
    public final Object onRetainNonConfigurationInstance() {
        return this.O0;
    }
    
    public void onStart() {
        super.onStart();
        this.Q0 = true;
    }
    
    public void onStop() {
        this.Q0 = false;
        super.onStop();
    }
    
    public final UserIdentifier q() {
        return this.P0;
    }
    
    public final xba<Configuration> u() {
        return (xba<Configuration>)this.I0;
    }
    
    public final Object v(final String s, final Object o) {
        Object o2;
        if (o != null) {
            o2 = ((HashMap<String, Object>)this.O0).put(s, o);
        }
        else {
            o2 = ((HashMap<K, Object>)this.O0).remove(s);
        }
        return o2;
    }
    
    public final xba<bo> z() {
        return (xba<bo>)this.J0;
    }
}
