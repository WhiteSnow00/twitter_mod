import java.util.Iterator;
import java.util.Map;
import kotlin.reflect.KClass;
import java.util.Arrays;
import java.util.Objects;
import java.util.List;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class euo implements huo$c
{
    public final huo a;
    public boolean b;
    public Bundle c;
    public final h5s d;
    
    public euo(final huo a, final pax pax) {
        e0e.f((Object)a, "savedStateRegistry");
        e0e.f((Object)pax, "viewModelStoreOwner");
        this.a = a;
        this.d = (h5s)jty.N((ptb)new ptb<fuo>(pax) {
            public final pax F0;
            
            public final Object invoke() {
                final pax f0 = this.F0;
                e0e.f((Object)f0, "<this>");
                final sog sog = new sog(1);
                final cuo f2 = cuo.F0;
                final KClass a = iam.a((Class)fuo.class);
                e0e.f((Object)a, "clazz");
                e0e.f((Object)f2, "initializer");
                ((List)sog.F0).add(new aax(jb2.Z(a), (stb)f2));
                final Object[] array = ((List)sog.F0).toArray(new aax[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                final aax[] array2 = (aax[])array;
                final knd knd = new knd((aax<?>[])Arrays.copyOf(array2, ((aax<?>[])array2).length));
                final lax t = f0.t();
                e0e.e((Object)t, "owner.viewModelStore");
                Object o;
                if (f0 instanceof pdc) {
                    o = ((pdc)f0).i0();
                    e0e.e(o, "{\n        owner.defaultV\u2026ModelCreationExtras\n    }");
                }
                else {
                    o = f67$a.b;
                }
                return new gax(t, (gax$a)knd, (f67)o).b("androidx.lifecycle.internal.SavedStateHandlesVM", (Class)fuo.class);
            }
        });
    }
    
    public final Bundle a() {
        final Bundle bundle = new Bundle();
        final Bundle c = this.c;
        if (c != null) {
            bundle.putAll(c);
        }
        for (final Map.Entry<String, V> entry : ((fuo)this.d.getValue()).c.entrySet()) {
            final String s = entry.getKey();
            final Bundle a = ((auo)entry.getValue()).e.a();
            if (!e0e.a((Object)a, (Object)Bundle.EMPTY)) {
                bundle.putBundle(s, a);
            }
        }
        this.b = false;
        return bundle;
    }
}
