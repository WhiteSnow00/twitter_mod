import android.view.ViewGroup;
import java.util.Iterator;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.MapView$a;
import com.google.android.gms.maps.MapView$b;
import android.content.Intent;
import android.content.Context;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout;
import android.widget.FrameLayout;
import java.util.LinkedList;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cm8<T extends nbf>
{
    public T a;
    public Bundle b;
    public LinkedList<e5y> c;
    public final dh3 d;
    
    public cm8() {
        this.d = new dh3(this);
    }
    
    public static void a(final FrameLayout frameLayout) {
        final int c = r5c.c;
        final r5c e = r5c.e;
        final Context context = ((View)frameLayout).getContext();
        final int d = e.d(context);
        final String c2 = s3y.c(context, d);
        final String b = s3y.b(context, d);
        final LinearLayout linearLayout = new LinearLayout(((View)frameLayout).getContext());
        linearLayout.setOrientation(1);
        ((View)linearLayout).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
        ((ViewGroup)frameLayout).addView((View)linearLayout);
        final TextView textView = new TextView(((View)frameLayout).getContext());
        ((View)textView).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
        textView.setText((CharSequence)c2);
        ((ViewGroup)linearLayout).addView((View)textView);
        final Intent b2 = e.b(context, d, (String)null);
        if (b2 != null) {
            final Button button = new Button(context);
            ((View)button).setId(16908313);
            ((View)button).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
            ((TextView)button).setText((CharSequence)b);
            ((ViewGroup)linearLayout).addView((View)button);
            ((View)button).setOnClickListener((View$OnClickListener)new s4y(context, b2));
        }
    }
    
    public final void b(final int n) {
        while (!this.c.isEmpty() && this.c.getLast().a() >= n) {
            this.c.removeLast();
        }
    }
    
    public final void c(final Bundle bundle, final e5y e5y) {
        if (this.a != null) {
            e5y.c();
            return;
        }
        if (this.c == null) {
            this.c = new LinkedList<e5y>();
        }
        this.c.add(e5y);
        if (bundle != null) {
            final Bundle b = this.b;
            if (b == null) {
                this.b = (Bundle)bundle.clone();
            }
            else {
                b.putAll(bundle);
            }
        }
        final dh3 d = this.d;
        final MapView$b mapView$b = (MapView$b)this;
        mapView$b.g = d;
        if (d == null || ((cm8)mapView$b).a != null) {
            goto Label_0238;
        }
        try {
            llg.f(mapView$b.f);
            final h3d y1 = wny.b(mapView$b.f).y1((l3d)new p5j(mapView$b.f), mapView$b.h);
            if (y1 == null) {
                goto Label_0238;
            }
            mapView$b.g.j((nbf)new MapView$a(mapView$b.e, y1));
            final Iterator iterator = mapView$b.i.iterator();
            while (iterator.hasNext()) {
                ((MapView$a)((cm8)mapView$b).a).a((pjj)iterator.next());
            }
            mapView$b.i.clear();
            goto Label_0238;
        }
        catch (final RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
        catch (final GooglePlayServicesNotAvailableException ex2) {
            goto Label_0238;
        }
    }
}
