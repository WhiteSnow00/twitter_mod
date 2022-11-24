import java.util.Set;
import android.net.Uri;
import android.util.Log;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;
import java.util.ArrayList;
import android.content.BroadcastReceiver;
import java.util.HashMap;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c4g
{
    public static final Object f;
    public static c4g g;
    public final Context a;
    public final HashMap<BroadcastReceiver, ArrayList<c>> b;
    public final HashMap<String, ArrayList<c>> c;
    public final ArrayList<b> d;
    public final c4g$a e;
    
    static {
        f = new Object();
    }
    
    public c4g(final Context a) {
        this.b = new HashMap<BroadcastReceiver, ArrayList<c>>();
        this.c = new HashMap<String, ArrayList<c>>();
        this.d = new ArrayList<b>();
        this.a = a;
        this.e = new Handler(this, a.getMainLooper()) {
            public final c4g a;
            
            public final void handleMessage(final Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                final c4g a = this.a;
                while (true) {
                    Object b = a.b;
                    synchronized (b) {
                        final int size = a.d.size();
                        if (size <= 0) {
                            return;
                        }
                        final b[] array = new b[size];
                        a.d.toArray(array);
                        a.d.clear();
                        monitorexit(b);
                        for (final b b2 : array) {
                            for (int size2 = b2.b.size(), j = 0; j < size2; ++j) {
                                b = b2.b.get(j);
                                if (!((c)b).d) {
                                    ((c)b).b.onReceive(a.a, b2.a);
                                }
                            }
                        }
                    }
                }
            }
        };
    }
    
    public static c4g a(final Context context) {
        synchronized (c4g.f) {
            if (c4g.g == null) {
                c4g.g = new c4g(context.getApplicationContext());
            }
            return c4g.g;
        }
    }
    
    public final void b(final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter) {
        synchronized (this.b) {
            final c c = new c(intentFilter, broadcastReceiver);
            ArrayList list;
            if ((list = this.b.get(broadcastReceiver)) == null) {
                list = new ArrayList(1);
                this.b.put(broadcastReceiver, list);
            }
            list.add(c);
            for (int i = 0; i < intentFilter.countActions(); ++i) {
                final String action = intentFilter.getAction(i);
                ArrayList list2;
                if ((list2 = this.c.get(action)) == null) {
                    list2 = new ArrayList(1);
                    this.c.put(action, list2);
                }
                list2.add(c);
            }
        }
    }
    
    public final boolean c(final Intent intent) {
        synchronized (this.b) {
            final String action = intent.getAction();
            final String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.a.getContentResolver());
            final Uri data = intent.getData();
            final String scheme = intent.getScheme();
            final Set categories = intent.getCategories();
            final boolean b = (intent.getFlags() & 0x8) != 0x0;
            if (b) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Resolving type ");
                sb.append(resolveTypeIfNeeded);
                sb.append(" scheme ");
                sb.append(scheme);
                sb.append(" of intent ");
                sb.append(intent);
                Log.v("LocalBroadcastManager", sb.toString());
            }
            final ArrayList list = this.c.get(intent.getAction());
            if (list != null) {
                if (b) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Action list: ");
                    sb2.append(list);
                    Log.v("LocalBroadcastManager", sb2.toString());
                }
                ArrayList<c> list2 = null;
                for (int i = 0; i < list.size(); ++i) {
                    final c c = (c)list.get(i);
                    if (b) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("Matching against filter ");
                        sb3.append(c.a);
                        Log.v("LocalBroadcastManager", sb3.toString());
                    }
                    if (c.c) {
                        if (b) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                    }
                    else {
                        final int match = c.a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (b) {
                                final StringBuilder sb4 = new StringBuilder();
                                sb4.append("  Filter matched!  match=0x");
                                sb4.append(Integer.toHexString(match));
                                Log.v("LocalBroadcastManager", sb4.toString());
                            }
                            if (list2 == null) {
                                list2 = new ArrayList<c>();
                            }
                            list2.add(c);
                            c.c = true;
                        }
                        else if (b) {
                            String s;
                            if (match != -4) {
                                if (match != -3) {
                                    if (match != -2) {
                                        if (match != -1) {
                                            s = "unknown reason";
                                        }
                                        else {
                                            s = "type";
                                        }
                                    }
                                    else {
                                        s = "data";
                                    }
                                }
                                else {
                                    s = "action";
                                }
                            }
                            else {
                                s = "category";
                            }
                            final StringBuilder sb5 = new StringBuilder();
                            sb5.append("  Filter did not match: ");
                            sb5.append(s);
                            Log.v("LocalBroadcastManager", sb5.toString());
                        }
                    }
                }
                if (list2 != null) {
                    for (int j = 0; j < list2.size(); ++j) {
                        list2.get(j).c = false;
                    }
                    this.d.add(new b(intent, list2));
                    if (!this.e.hasMessages(1)) {
                        this.e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
    
    public final void d(final BroadcastReceiver broadcastReceiver) {
        synchronized (this.b) {
            final ArrayList list = this.b.remove(broadcastReceiver);
            if (list == null) {
                return;
            }
            for (int i = list.size() - 1; i >= 0; --i) {
                final c c = (c)list.get(i);
                c.d = true;
                for (int j = 0; j < c.a.countActions(); ++j) {
                    final String action = c.a.getAction(j);
                    final ArrayList list2 = this.c.get(action);
                    if (list2 != null) {
                        for (int k = list2.size() - 1; k >= 0; --k) {
                            final c c2 = (c)list2.get(k);
                            if (c2.b == broadcastReceiver) {
                                c2.d = true;
                                list2.remove(k);
                            }
                        }
                        if (list2.size() <= 0) {
                            this.c.remove(action);
                        }
                    }
                }
            }
        }
    }
    
    public static final class b
    {
        public final Intent a;
        public final ArrayList<c> b;
        
        public b(final Intent a, final ArrayList<c> b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class c
    {
        public final IntentFilter a;
        public final BroadcastReceiver b;
        public boolean c;
        public boolean d;
        
        public c(final IntentFilter a, final BroadcastReceiver b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.b);
            sb.append(" filter=");
            sb.append(this.a);
            if (this.d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }
}
