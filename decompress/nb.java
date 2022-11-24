import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nb<T> implements v88<T>
{
    public Map<String, Object> a;
    public int b;
    public boolean c;
    public T d;
    public Throwable e;
    public float f;
    public final ConcurrentLinkedQueue<Pair<b98<T>, Executor>> g;
    
    public nb() {
        this.d = null;
        this.e = null;
        this.f = 0.0f;
        this.c = false;
        this.b = 1;
        this.g = new ConcurrentLinkedQueue<Pair<b98<T>, Executor>>();
    }
    
    @Override
    public boolean a() {
        synchronized (this) {
            return this.d != null;
        }
    }
    
    @Override
    public final float b() {
        synchronized (this) {
            return this.f;
        }
    }
    
    @Override
    public final void c(final b98<T> b98, final Executor executor) {
        Objects.requireNonNull(executor);
        synchronized (this) {
            if (this.c) {
                return;
            }
            final int b99 = this.b;
            boolean b100 = true;
            if (b99 == 1) {
                this.g.add((Pair<b98<T>, Executor>)Pair.create((Object)b98, (Object)executor));
            }
            final boolean b101 = this.a() || this.g() || this.l();
            monitorexit(this);
            if (b101) {
                monitorenter(this);
                try {
                    if (this.b != 3) {
                        b100 = false;
                    }
                    monitorexit(this);
                    executor.execute((Runnable)new lb(this, b100, (b98)b98, this.l()));
                }
                finally {}
            }
        }
    }
    
    @Override
    public boolean close() {
        synchronized (this) {
            if (this.c) {
                return false;
            }
            this.c = true;
            final T d = this.d;
            this.d = null;
            monitorexit(this);
            if (d != null) {
                this.e(d);
            }
            if (!this.g()) {
                this.h();
            }
            synchronized (this) {
                this.g.clear();
                return true;
            }
        }
    }
    
    @Override
    public T d() {
        synchronized (this) {
            return this.d;
        }
    }
    
    public void e(final T t) {
    }
    
    public final Throwable f() {
        synchronized (this) {
            return this.e;
        }
    }
    
    public final boolean g() {
        synchronized (this) {
            final int b = this.b;
            boolean b2 = true;
            if (b == 1) {
                b2 = false;
            }
            return b2;
        }
    }
    
    @Override
    public final Map<String, Object> getExtras() {
        return this.a;
    }
    
    public final void h() {
        synchronized (this) {
            final boolean b = this.b == 3;
            monitorexit(this);
            final boolean l = this.l();
            for (final Pair pair : this.g) {
                ((Executor)pair.second).execute((Runnable)new lb(this, b, (b98)pair.first, l));
            }
        }
    }
    
    public final boolean i(final Throwable e, final Map<String, Object> a) {
        synchronized (this) {
            final boolean c = this.c;
            boolean b = true;
            if (!c && this.b == 1) {
                this.b = 3;
                this.e = e;
                this.a = a;
                monitorexit(this);
            }
            else {
                b = false;
                monitorexit(this);
            }
            if (b) {
                this.h();
            }
            return b;
        }
    }
    
    @Override
    public final boolean isClosed() {
        synchronized (this) {
            return this.c;
        }
    }
    
    public final boolean j(final float f) {
        synchronized (this) {
            final boolean c = this.c;
            boolean b = false;
            if (!c && this.b == 1) {
                if (f < this.f) {
                    monitorexit(this);
                }
                else {
                    this.f = f;
                    monitorexit(this);
                    b = true;
                }
            }
            else {
                monitorexit(this);
            }
            if (b) {
                for (final Pair pair : this.g) {
                    ((Executor)pair.second).execute((Runnable)new mb(this, (b98)pair.first));
                }
            }
            return b;
        }
    }
    
    public final boolean k(T d, final boolean b, Map<String, Object> d2) {
        this.a = (Map<String, Object>)d2;
        d2 = null;
        T t = null;
        T t2;
        try {
            monitorenter(this);
            try {
                final boolean c = this.c;
                final boolean b2 = true;
                final boolean b3 = true;
                Label_0097: {
                    if (c || this.b != 1) {
                        break Label_0097;
                    }
                    if (b) {
                        this.b = 2;
                        this.f = 1.0f;
                    }
                    d2 = this.d;
                    Label_0080: {
                        if (d2 != d) {
                            try {
                                this.d = d;
                                break Label_0080;
                            }
                            finally {
                                break Label_0097;
                            }
                        }
                        d = null;
                    }
                    d2 = d;
                    try {
                        monitorexit(this);
                        boolean b4 = b2;
                        while (true) {
                            while (true) {
                                if (d != null) {
                                    b4 = b3;
                                    this.e(d);
                                }
                                Label_0118: {
                                    if (b4) {
                                        this.h();
                                    }
                                }
                                return b4;
                                final boolean b5;
                                b4 = b5;
                                continue;
                            }
                            b4 = false;
                            final boolean b5 = false;
                            d2 = d;
                            monitorexit(this);
                            iftrue(Label_0118:)(d == null);
                            continue;
                        }
                    }
                    finally {}
                }
                t = (T)d2;
            }
            finally {
                d = t;
            }
            try {
                monitorexit(this);
                try {
                    throw d2;
                }
                finally {}
            }
            finally {}
        }
        finally {
            t2 = (T)d2;
        }
        if (t2 != null) {
            this.e(t2);
        }
    }
    
    public final boolean l() {
        synchronized (this) {
            return this.isClosed() && !this.g();
        }
    }
}
