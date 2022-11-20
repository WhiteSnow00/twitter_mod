import android.annotation.SuppressLint;
import androidx.lifecycle.j;
import android.os.Bundle;
import android.view.View;
import android.view.Window$Callback;
import android.view.KeyEvent;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public class s06 extends Activity implements xaf, lpe$a
{
    public f D0;
    
    public s06() {
        this.D0 = new f((xaf)this);
    }
    
    public d b() {
        return (d)this.D0;
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        final View decorView = this.getWindow().getDecorView();
        return (decorView != null && lpe.a(decorView, keyEvent)) || lpe.b((lpe$a)this, decorView, (Window$Callback)this, keyEvent);
    }
    
    public final boolean dispatchKeyShortcutEvent(final KeyEvent keyEvent) {
        final View decorView = this.getWindow().getDecorView();
        return (decorView != null && lpe.a(decorView, keyEvent)) || super.dispatchKeyShortcutEvent(keyEvent);
    }
    
    public final boolean e(final KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
    
    @SuppressLint({ "RestrictedApi" })
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        j.c((Activity)this);
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        final f d0 = this.D0;
        d0.e("markState");
        d0.k();
        super.onSaveInstanceState(bundle);
    }
}
