import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.w$a;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.i;
import com.google.android.exoplayer2.w$b;
import android.os.Bundle;
import android.app.Notification;
import android.content.BroadcastReceiver;
import java.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
import android.graphics.Bitmap;
import com.google.android.exoplayer2.w$c;
import android.content.Intent;
import java.util.Iterator;
import java.util.Collections;
import java.util.HashMap;
import android.os.Handler$Callback;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import com.google.android.exoplayer2.w;
import java.util.List;
import android.app.PendingIntent;
import java.util.Map;
import android.content.IntentFilter;
import android.os.Handler;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jnk
{
    public static int H;
    public int A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public String G;
    public final Context a;
    public final String b;
    public final int c;
    public final c d;
    public final e e;
    public final b f;
    public final Handler g;
    public final mti h;
    public final IntentFilter i;
    public final f j;
    public final d k;
    public final Map<String, iqi> l;
    public final Map<String, iqi> m;
    public final PendingIntent n;
    public final int o;
    public mqi p;
    public List<iqi> q;
    public w r;
    public boolean s;
    public int t;
    public MediaSessionCompat$Token u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    
    public jnk(Context applicationContext, final String b, int h, final c d, final e e, int a, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        applicationContext = applicationContext.getApplicationContext();
        this.a = applicationContext;
        this.b = b;
        this.c = h;
        this.d = d;
        this.e = e;
        this.f = null;
        this.C = a;
        this.G = null;
        h = jnk.H;
        jnk.H = h + 1;
        this.o = h;
        final Looper mainLooper = Looper.getMainLooper();
        final ink ink = new ink(this);
        a = imw.a;
        this.g = new Handler(mainLooper, (Handler$Callback)ink);
        this.h = new mti(applicationContext);
        this.j = new f();
        this.k = new d();
        this.i = new IntentFilter();
        this.v = true;
        this.w = true;
        this.z = true;
        this.x = true;
        this.y = true;
        this.B = true;
        this.F = true;
        this.E = -1;
        this.A = 1;
        this.D = 1;
        final HashMap l = new HashMap();
        l.put("com.google.android.exoplayer.play", new iqi(n, (CharSequence)applicationContext.getString(2131953964), a("com.google.android.exoplayer.play", applicationContext, h)));
        l.put("com.google.android.exoplayer.pause", new iqi(n2, (CharSequence)applicationContext.getString(2131953963), a("com.google.android.exoplayer.pause", applicationContext, h)));
        l.put("com.google.android.exoplayer.stop", new iqi(n3, (CharSequence)applicationContext.getString(2131953976), a("com.google.android.exoplayer.stop", applicationContext, h)));
        l.put("com.google.android.exoplayer.rewind", new iqi(n4, (CharSequence)applicationContext.getString(2131953970), a("com.google.android.exoplayer.rewind", applicationContext, h)));
        l.put("com.google.android.exoplayer.ffwd", new iqi(n5, (CharSequence)applicationContext.getString(2131953956), a("com.google.android.exoplayer.ffwd", applicationContext, h)));
        l.put("com.google.android.exoplayer.prev", new iqi(n6, (CharSequence)applicationContext.getString(2131953966), a("com.google.android.exoplayer.prev", applicationContext, h)));
        l.put("com.google.android.exoplayer.next", new iqi(n7, (CharSequence)applicationContext.getString(2131953960), a("com.google.android.exoplayer.next", applicationContext, h)));
        this.l = l;
        final Iterator iterator = l.keySet().iterator();
        while (iterator.hasNext()) {
            this.i.addAction((String)iterator.next());
        }
        final Map<Object, Object> emptyMap = (Map<Object, Object>)Collections.emptyMap();
        this.m = (Map<String, iqi>)emptyMap;
        final Iterator<String> iterator2 = emptyMap.keySet().iterator();
        while (iterator2.hasNext()) {
            this.i.addAction((String)iterator2.next());
        }
        this.n = a("com.google.android.exoplayer.dismiss", applicationContext, this.o);
        this.i.addAction("com.google.android.exoplayer.dismiss");
    }
    
    public static PendingIntent a(final String s, final Context context, final int n) {
        final Intent setPackage = new Intent(s).setPackage(context.getPackageName());
        setPackage.putExtra("INSTANCE_ID", n);
        int n2;
        if (imw.a >= 23) {
            n2 = 201326592;
        }
        else {
            n2 = 134217728;
        }
        return PendingIntent.getBroadcast(context, n, setPackage, n2);
    }
    
    public final void b() {
        if (this.s) {
            this.c();
        }
    }
    
    public final void c() {
        if (!this.g.hasMessages(0)) {
            this.g.sendEmptyMessage(0);
        }
    }
    
    public final void d(final w r) {
        final Looper myLooper = Looper.myLooper();
        final Looper mainLooper = Looper.getMainLooper();
        final boolean b = true;
        ri4.t(myLooper == mainLooper);
        boolean b2 = b;
        if (r != null) {
            b2 = (((q2)r).N0() == Looper.getMainLooper() && b);
        }
        ri4.k(b2);
        final w r2 = this.r;
        if (r2 == r) {
            return;
        }
        if (r2 != null) {
            r2.x((w$c)this.j);
            if (r == null) {
                this.g(false);
            }
        }
        if ((this.r = r) != null) {
            ((q2)r).x0((w$c)this.j);
            this.c();
        }
    }
    
    public final boolean e(final w w) {
        final int n = w.n();
        boolean b = true;
        if (n == 4 || w.n() == 1 || !w.e0()) {
            b = false;
        }
        return b;
    }
    
    public final void f(final w w, Bitmap e) {
        final int n = w.n();
        final boolean b = false;
        final boolean b2 = (n == 2 || n == 3) && w.e0();
        final mqi p2 = this.p;
        mqi p3 = null;
        if (w.n() == 1 && w.U().r()) {
            this.q = null;
            p3 = null;
        }
        else {
            final boolean o = w.O(7);
            final boolean o2 = w.O(11);
            final boolean o3 = w.O(12);
            final boolean o4 = w.O(9);
            final ArrayList<String> list = new ArrayList<String>();
            if (this.v && o) {
                list.add("com.google.android.exoplayer.prev");
            }
            if (this.x && o2) {
                list.add("com.google.android.exoplayer.rewind");
            }
            if (this.z) {
                if (this.e(w)) {
                    list.add("com.google.android.exoplayer.pause");
                }
                else {
                    list.add("com.google.android.exoplayer.play");
                }
            }
            if (this.y && o3) {
                list.add("com.google.android.exoplayer.ffwd");
            }
            if (this.w && o4) {
                list.add("com.google.android.exoplayer.next");
            }
            final b f = this.f;
            if (f != null) {
                list.addAll(f.a());
            }
            final ArrayList q = new ArrayList<iqi>(list.size());
            for (int i = 0; i < list.size(); ++i) {
                final String s = list.get(i);
                iqi iqi;
                if (this.l.containsKey(s)) {
                    iqi = this.l.get(s);
                }
                else {
                    iqi = this.m.get(s);
                }
                if (iqi != null) {
                    q.add(iqi);
                }
            }
            Label_0458: {
                if (p2 != null) {
                    p3 = p2;
                    if (q.equals(this.q)) {
                        break Label_0458;
                    }
                }
                final mqi mqi = new mqi(this.a, this.b);
                this.q = q;
                int n2 = 0;
                while (true) {
                    p3 = mqi;
                    if (n2 >= q.size()) {
                        break;
                    }
                    final iqi iqi2 = q.get(n2);
                    if (iqi2 != null) {
                        mqi.b.add(iqi2);
                    }
                    ++n2;
                }
            }
            final pqi pqi = new pqi();
            final MediaSessionCompat$Token u = this.u;
            if (u != null) {
                pqi.f = u;
            }
            final int index = list.indexOf("com.google.android.exoplayer.pause");
            final int index2 = list.indexOf("com.google.android.exoplayer.play");
            final int[] array = new int[3];
            final boolean e2 = this.e(w);
            int n3 = 0;
            Label_0556: {
                if (index != -1 && e2) {
                    array[0] = index;
                }
                else {
                    if (index2 == -1 || e2) {
                        n3 = 0;
                        break Label_0556;
                    }
                    array[0] = index2;
                }
                n3 = 1;
            }
            pqi.e = Arrays.copyOf(array, n3);
            p3.m(pqi);
            p3.F.deleteIntent = this.n;
            p3.C = this.A;
            p3.i(2, b2);
            p3.x = 0;
            p3.u = this.B;
            p3.v = true;
            p3.F.icon = this.C;
            p3.y = this.D;
            p3.j = this.E;
            p3.h(0);
            if (imw.a >= 21 && this.F && w.v() && !w.r() && !w.Q() && w.a().C0 == 1.0f) {
                p3.F.when = System.currentTimeMillis() - w.w0();
                p3.k = true;
                p3.l = true;
            }
            else {
                p3.k = false;
                p3.l = false;
            }
            p3.g(this.d.b(w));
            p3.f(this.d.d(w));
            this.d.c();
            p3.n = null;
            if (e == null) {
                final c d = this.d;
                ++this.t;
                e = d.e(w, new a());
            }
            p3.j(e);
            p3.g = this.d.a(w);
            final String g = this.G;
            if (g != null) {
                p3.r = g;
            }
            p3.l();
        }
        this.p = p3;
        if (p3 == null) {
            this.g(false);
            return;
        }
        final Notification b3 = p3.b();
        final mti h = this.h;
        final int c = this.c;
        Objects.requireNonNull(h);
        final Bundle extras = b3.extras;
        if (extras != null && extras.getBoolean("android.support.useSideChannel")) {
            h.c((mti$d)new mti$a(h.a.getPackageName(), c, b3));
            h.b.cancel((String)null, c);
        }
        else {
            h.b.notify((String)null, c, b3);
        }
        if (!this.s) {
            this.a.registerReceiver((BroadcastReceiver)this.k, this.i);
        }
        final e e3 = this.e;
        if (e3 != null) {
            final int c2 = this.c;
            boolean b4 = false;
            Label_1080: {
                if (!b2) {
                    b4 = b;
                    if (this.s) {
                        break Label_1080;
                    }
                }
                b4 = true;
            }
            e3.b(c2, b3, b4);
        }
        this.s = true;
    }
    
    public final void g(final boolean b) {
        if (this.s) {
            this.s = false;
            this.g.removeMessages(0);
            this.h.b.cancel((String)null, this.c);
            this.a.unregisterReceiver((BroadcastReceiver)this.k);
            final e e = this.e;
            if (e != null) {
                e.a();
            }
        }
    }
    
    public final class a
    {
    }
    
    public interface b
    {
        List<String> a(final w p0);
        
        void b();
    }
    
    public interface c
    {
        PendingIntent a(final w p0);
        
        CharSequence b(final w p0);
        
        void c();
        
        CharSequence d(final w p0);
        
        Bitmap e(final w p0, final a p1);
    }
    
    public final class d extends BroadcastReceiver
    {
        public final void onReceive(final Context context, final Intent intent) {
            final jnk a = jnk.this;
            final w r = a.r;
            if (r != null && a.s) {
                if (intent.getIntExtra("INSTANCE_ID", a.o) == jnk.this.o) {
                    final String action = intent.getAction();
                    if ("com.google.android.exoplayer.play".equals(action)) {
                        if (r.n() == 1) {
                            r.l();
                        }
                        else if (r.n() == 4) {
                            r.u0(r.C0());
                        }
                        r.p();
                    }
                    else if ("com.google.android.exoplayer.pause".equals(action)) {
                        r.b();
                    }
                    else if ("com.google.android.exoplayer.prev".equals(action)) {
                        r.E();
                    }
                    else if ("com.google.android.exoplayer.rewind".equals(action)) {
                        r.J0();
                    }
                    else if ("com.google.android.exoplayer.ffwd".equals(action)) {
                        r.I0();
                    }
                    else if ("com.google.android.exoplayer.next".equals(action)) {
                        r.Y();
                    }
                    else if ("com.google.android.exoplayer.stop".equals(action)) {
                        r.f0(true);
                    }
                    else if ("com.google.android.exoplayer.dismiss".equals(action)) {
                        jnk.this.g(true);
                    }
                    else if (action != null) {
                        final jnk a2 = jnk.this;
                        if (a2.f != null && a2.m.containsKey(action)) {
                            jnk.this.f.b();
                        }
                    }
                }
            }
        }
    }
    
    public interface e
    {
        void a();
        
        void b(final int p0, final Notification p1, final boolean p2);
    }
    
    public final class f implements w$c
    {
        public final void B0(final w w, final w$b w$b) {
            final r2b a = w$b.a;
            Objects.requireNonNull(a);
            final int n = 0;
            int n2 = 0;
            int n3;
            while (true) {
                n3 = n;
                if (n2 >= 9) {
                    break;
                }
                if (a.a.get((new int[] { 4, 5, 7, 0, 12, 11, 8, 9, 14 })[n2])) {
                    n3 = 1;
                    break;
                }
                ++n2;
            }
            if (n3 != 0) {
                jnk.this.c();
            }
        }
    }
}
