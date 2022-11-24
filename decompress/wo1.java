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

public class wo1 extends kk0 implements cbf, pec, ytm, cdc, hec
{
    public final de6 H0;
    public final y06 I0;
    public final mn$a J0;
    public final gda<Configuration> K0;
    public final gda<fo> L0;
    public final gda<l7k> M0;
    public final gda<rf1> N0;
    public final gda<lnd> O0;
    public final gda<h5h> P0;
    public final Map<String, Object> Q0;
    public UserIdentifier R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    
    public wo1() {
        this.H0 = new de6();
        final y06 i0 = new y06();
        this.I0 = i0;
        final int a = ln.a;
        Objects.requireNonNull(mn.Companion);
        this.J0 = new mn$a();
        final kcm$b companion = kcm.Companion;
        this.K0 = (gda<Configuration>)new gda((gba)companion.a((yz5)i0), false);
        this.L0 = (gda<fo>)new gda((gba)companion.a((yz5)i0), false);
        this.M0 = (gda<l7k>)new gda((gba)companion.a((yz5)i0), false);
        this.N0 = (gda<rf1>)new gda((gba)companion.a((yz5)i0), false);
        this.O0 = (gda<lnd>)new gda((gba)companion.a((yz5)i0), false);
        this.P0 = (gda<h5h>)new gda((gba)companion.a((yz5)i0), false);
        this.Q0 = (nuh$a)nuh.a(0);
        this.R0 = UserIdentifier.UNDEFINED;
    }
    
    public final fda<lnd> A0() {
        return (fda<lnd>)this.O0;
    }
    
    public final fda<l7k> D() {
        return (fda<l7k>)this.M0;
    }
    
    public final <T> T D0(final String s) {
        final T value = ((HashMap<K, T>)this.Q0).get(s);
        final int a = o5j.a;
        return value;
    }
    
    public final fda<h5h> G0() {
        return (fda<h5h>)this.P0;
    }
    
    public final fda<rf1> J() {
        return (fda<rf1>)this.N0;
    }
    
    public final void K(final jn jn) {
        final mn$a j0 = this.J0;
        Objects.requireNonNull(j0);
        fj1.f();
        j0.a.add(jn);
    }
    
    public final boolean Y() {
        return this.S0 && !((Activity)this).isFinishing();
    }
    
    public final void attachBaseContext(final Context context) {
        super.attachBaseContext(g6s.e(context));
        if (!xes.c) {
            i3r.b((Context)this);
        }
    }
    
    public final void c(final Map<String, Object> map) {
        ((HashMap)this.Q0).clear();
        if (map != null) {
            final nuh$a q0 = this.Q0;
            final int a = o5j.a;
            ((HashMap)q0).putAll(map);
        }
    }
    
    public final void d(final b39 b39) {
        this.H0.a(b39);
    }
    
    public final boolean isDestroyed() {
        return this.U0;
    }
    
    public final boolean j() {
        return this.T0;
    }
    
    public final Map<String, Object> m0() {
        return (Map<String, Object>)this.Q0;
    }
    
    public final void onActivityResult(final int n, final int n2, final Intent intent) {
        this.L0.e((Object)new fo(n, n2, intent));
        super.onActivityResult(n, n2, intent);
    }
    
    public void onBackPressed() {
        this.N0.e((Object)rf1.a);
        super.onBackPressed();
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.K0.e((Object)configuration);
    }
    
    public void onCreate(final Bundle bundle) {
        UserIdentifier r0 = aj1.fromIntent(((Activity)this).getIntent()).getOwner();
        if (!r0.isDefined()) {
            r0 = UserIdentifier.getCurrent();
        }
        this.R0 = r0;
        final Object lastNonConfigurationInstance = ((Activity)this).getLastNonConfigurationInstance();
        final int a = o5j.a;
        final Map map = (Map)lastNonConfigurationInstance;
        ((HashMap)this.Q0).clear();
        if (map != null) {
            ((HashMap<Object, Object>)this.Q0).putAll(map);
        }
        super.onCreate(bundle);
    }
    
    public boolean onCreateOptionsMenu(final Menu menu) {
        this.P0.e((Object)new h5h$a(menu));
        return super.onCreateOptionsMenu(menu);
    }
    
    public void onDestroy() {
        this.H0.dispose();
        this.U0 = true;
        super.onDestroy();
        this.I0.onComplete();
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        this.O0.e((Object)new gqe(keyEvent));
        return super.onKeyDown(n, keyEvent);
    }
    
    public final boolean onKeyLongPress(final int n, final KeyEvent keyEvent) {
        this.O0.e((Object)new rqe(keyEvent));
        return super.onKeyLongPress(n, keyEvent);
    }
    
    public final boolean onKeyMultiple(final int n, final int n2, final KeyEvent keyEvent) {
        this.O0.e((Object)new wqe(keyEvent));
        return super.onKeyMultiple(n, n2, keyEvent);
    }
    
    public final boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        this.O0.e((Object)new gre(keyEvent));
        return super.onKeyUp(n, keyEvent);
    }
    
    public final void onNewIntent(final Intent intent) {
        this.J0.a((Activity)this, intent);
        super.onNewIntent(intent);
    }
    
    public final boolean onOptionsItemSelected(final MenuItem menuItem) {
        this.P0.e((Object)new h5h$b(menuItem));
        return super.onOptionsItemSelected(menuItem);
    }
    
    public final void onPause() {
        this.T0 = false;
        super.onPause();
    }
    
    public final boolean onPrepareOptionsMenu(final Menu menu) {
        this.P0.e((Object)new h5h$d(menu));
        return super.onPrepareOptionsMenu(menu);
    }
    
    public final void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        u7k.d().h((Activity)this, array);
        this.M0.e((Object)l7k.Companion.a(n, array, array2));
        super.onRequestPermissionsResult(n, array, array2);
    }
    
    public void onResume() {
        super.onResume();
        this.T0 = true;
    }
    
    public final Object onRetainNonConfigurationInstance() {
        return this.Q0;
    }
    
    public void onStart() {
        super.onStart();
        this.S0 = true;
    }
    
    public void onStop() {
        this.S0 = false;
        super.onStop();
    }
    
    public final UserIdentifier r() {
        return this.R0;
    }
    
    public final fda<Configuration> u() {
        return (fda<Configuration>)this.K0;
    }
    
    public final Object v(final String s, final Object o) {
        Object o2;
        if (o != null) {
            o2 = ((HashMap<String, Object>)this.Q0).put(s, o);
        }
        else {
            o2 = ((HashMap<K, Object>)this.Q0).remove(s);
        }
        return o2;
    }
    
    public final fda<fo> z() {
        return (fda<fo>)this.L0;
    }
}
