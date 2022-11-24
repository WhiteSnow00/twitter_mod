// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.tooling;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;
import java.lang.reflect.Constructor;
import android.content.Intent;
import android.util.Log;
import android.os.Bundle;
import kotlin.Metadata;
import androidx.activity.ComponentActivity;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004" }, d2 = { "Landroidx/compose/ui/tooling/PreviewActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "ui-tooling_release" }, k = 1, mv = { 1, 7, 1 })
public final class PreviewActivity extends ComponentActivity
{
    public final String S0;
    
    public PreviewActivity() {
        this.S0 = "PreviewActivity";
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if ((((Context)this).getApplicationInfo().flags & 0x2) == 0x0) {
            Log.d(this.S0, "Application is not debuggable. Compose Preview not allowed.");
            ((Activity)this).finish();
            return;
        }
        final Intent intent = ((Activity)this).getIntent();
        if (intent != null) {
            final String stringExtra = intent.getStringExtra("composable");
            if (stringExtra != null) {
                final String s0 = this.S0;
                final StringBuilder sb = new StringBuilder();
                sb.append("PreviewActivity has composable ");
                sb.append(stringExtra);
                Log.d(s0, sb.toString());
                final int n = 0;
                final int b1 = wlr.B1((CharSequence)stringExtra, '.', 0, 6);
                String substring;
                if (b1 == -1) {
                    substring = stringExtra;
                }
                else {
                    substring = stringExtra.substring(0, b1);
                    e0e.e((Object)substring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                }
                final String v1 = wlr.V1(stringExtra, '.');
                final String stringExtra2 = ((Activity)this).getIntent().getStringExtra("parameterProviderClassName");
                if (stringExtra2 != null) {
                    final String s2 = this.S0;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Previewing '");
                    sb2.append(v1);
                    sb2.append("' with parameter provider: '");
                    sb2.append(stringExtra2);
                    sb2.append('\'');
                    Log.d(s2, sb2.toString());
                    Class<?> forName;
                    try {
                        forName = Class.forName(stringExtra2);
                    }
                    catch (final ClassNotFoundException ex) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("Unable to find provider '");
                        sb3.append(stringExtra2);
                        sb3.append('\'');
                        Log.e("PreviewProvider", sb3.toString(), (Throwable)ex);
                        forName = null;
                    }
                    final int intExtra = ((Activity)this).getIntent().getIntExtra("parameterProviderIndex", -1);
                    Object[] array2 = null;
                    Label_0617: {
                        if (forName != null) {
                            try {
                                final Constructor[] constructors = forName.getConstructors();
                                e0e.e((Object)constructors, "parameterProviderClass.constructors");
                                final int length = constructors.length;
                                Constructor<lyk> constructor = null;
                                int i = 0;
                                int n2 = 0;
                                while (true) {
                                    while (true) {
                                        while (i < length) {
                                            final Constructor constructor2 = constructors[i];
                                            final Class[] parameterTypes = constructor2.getParameterTypes();
                                            e0e.e((Object)parameterTypes, "it.parameterTypes");
                                            final boolean b2 = parameterTypes.length == 0;
                                            int n3 = n2;
                                            if (b2) {
                                                if (n2 != 0) {
                                                    constructor = null;
                                                    if (constructor == null) {
                                                        throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
                                                    }
                                                    constructor.setAccessible(true);
                                                    final lyk instance = constructor.newInstance(new Object[0]);
                                                    e0e.d((Object)instance, "null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>");
                                                    final lyk lyk = instance;
                                                    if (intExtra < 0) {
                                                        final tkp a = lyk.a();
                                                        final int count = lyk.getCount();
                                                        final Iterator iterator = a.iterator();
                                                        final Object[] array = new Object[count];
                                                        int n4 = n;
                                                        while (true) {
                                                            array2 = array;
                                                            if (n4 >= count) {
                                                                break Label_0617;
                                                            }
                                                            array[n4] = iterator.next();
                                                            ++n4;
                                                        }
                                                    }
                                                    else {
                                                        final tkp a2 = lyk.a();
                                                        e0e.f((Object)a2, "<this>");
                                                        final hlp hlp = new hlp(intExtra);
                                                        if (intExtra >= 0) {
                                                            final Iterator iterator2 = a2.iterator();
                                                            int n5 = 0;
                                                            while (iterator2.hasNext()) {
                                                                final Object next = iterator2.next();
                                                                if (intExtra == n5) {
                                                                    array2 = new Object[] { next };
                                                                    break Label_0617;
                                                                }
                                                                ++n5;
                                                            }
                                                            hlp.invoke((Object)intExtra);
                                                            throw null;
                                                        }
                                                        hlp.invoke((Object)intExtra);
                                                        throw null;
                                                    }
                                                }
                                                else {
                                                    constructor = constructor2;
                                                    n3 = 1;
                                                }
                                            }
                                            ++i;
                                            n2 = n3;
                                        }
                                        if (n2 == 0) {
                                            continue;
                                        }
                                        break;
                                    }
                                    continue;
                                }
                            }
                            catch (final vse vse) {
                                throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
                            }
                        }
                        array2 = new Object[0];
                    }
                    if (array2.length > 1) {
                        z16.a((ComponentActivity)this, (hub)w9y.j(-1735847170, true, new ayk(array2, substring, v1)));
                    }
                    else {
                        z16.a((ComponentActivity)this, (hub)w9y.j(1507674311, true, new byk(substring, v1, array2)));
                    }
                }
                else {
                    final String s3 = this.S0;
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("Previewing '");
                    sb4.append(v1);
                    sb4.append("' without a parameter provider.");
                    Log.d(s3, sb4.toString());
                    z16.a((ComponentActivity)this, (hub)w9y.j(-161032931, true, new wxk(substring, v1)));
                }
            }
        }
    }
}
