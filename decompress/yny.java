import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;
import android.os.Bundle;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class yny extends rky implements doy
{
    public yny() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }
    
    public static doy asInterface(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof doy) {
            return (doy)queryLocalInterface;
        }
        return (doy)new tny(binder);
    }
    
    public final boolean s(int n, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        final boolean b = false;
        final boolean b2 = false;
        boolean dataCollectionEnabled = false;
        final roy roy = null;
        final fpy fpy = null;
        final fpy fpy2 = null;
        final fpy fpy3 = null;
        final roy roy2 = null;
        final roy roy3 = null;
        final roy roy4 = null;
        final roy roy5 = null;
        final roy roy6 = null;
        final roy roy7 = null;
        final lpy lpy = null;
        final roy roy8 = null;
        final roy roy9 = null;
        final roy roy10 = null;
        final roy roy11 = null;
        Object o = null;
        final roy roy12 = null;
        final roy roy13 = null;
        switch (n) {
            default: {
                return false;
            }
            case 45: {
                final Bundle bundle = (Bundle)uky.a(parcel, Bundle.CREATOR);
                final long long1 = parcel.readLong();
                uky.b(parcel);
                ((doy)this).setConsentThirdParty(bundle, long1);
                break;
            }
            case 44: {
                final Bundle bundle2 = (Bundle)uky.a(parcel, Bundle.CREATOR);
                final long long2 = parcel.readLong();
                uky.b(parcel);
                ((doy)this).setConsent(bundle2, long2);
                break;
            }
            case 43: {
                final long long3 = parcel.readLong();
                uky.b(parcel);
                ((doy)this).clearMeasurementEnabled(long3);
                break;
            }
            case 42: {
                final Bundle defaultEventParameters = (Bundle)uky.a(parcel, Bundle.CREATOR);
                uky.b(parcel);
                ((doy)this).setDefaultEventParameters(defaultEventParameters);
                break;
            }
            case 40: {
                final IBinder strongBinder = parcel.readStrongBinder();
                Object o2;
                if (strongBinder == null) {
                    o2 = roy13;
                }
                else {
                    final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof roy) {
                        o2 = queryLocalInterface;
                    }
                    else {
                        o2 = new ioy(strongBinder);
                    }
                }
                uky.b(parcel);
                ((doy)this).isDataCollectionEnabled((roy)o2);
                break;
            }
            case 39: {
                final ClassLoader a = uky.a;
                if (parcel.readInt() != 0) {
                    dataCollectionEnabled = true;
                }
                uky.b(parcel);
                ((doy)this).setDataCollectionEnabled(dataCollectionEnabled);
                break;
            }
            case 38: {
                final IBinder strongBinder2 = parcel.readStrongBinder();
                Object o3;
                if (strongBinder2 == null) {
                    o3 = roy;
                }
                else {
                    final IInterface queryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof roy) {
                        o3 = queryLocalInterface2;
                    }
                    else {
                        o3 = new ioy(strongBinder2);
                    }
                }
                n = parcel.readInt();
                uky.b(parcel);
                ((doy)this).getTestFlag((roy)o3, n);
                break;
            }
            case 37: {
                final HashMap hashMap = parcel.readHashMap(uky.a);
                uky.b(parcel);
                ((doy)this).initForTests((Map)hashMap);
                break;
            }
            case 36: {
                final IBinder strongBinder3 = parcel.readStrongBinder();
                Object o4;
                if (strongBinder3 == null) {
                    o4 = fpy;
                }
                else {
                    final IInterface queryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface3 instanceof fpy) {
                        o4 = queryLocalInterface3;
                    }
                    else {
                        o4 = new voy(strongBinder3);
                    }
                }
                uky.b(parcel);
                ((doy)this).unregisterOnMeasurementEventListener((fpy)o4);
                break;
            }
            case 35: {
                final IBinder strongBinder4 = parcel.readStrongBinder();
                Object o5;
                if (strongBinder4 == null) {
                    o5 = fpy2;
                }
                else {
                    final IInterface queryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface4 instanceof fpy) {
                        o5 = queryLocalInterface4;
                    }
                    else {
                        o5 = new voy(strongBinder4);
                    }
                }
                uky.b(parcel);
                ((doy)this).registerOnMeasurementEventListener((fpy)o5);
                break;
            }
            case 34: {
                final IBinder strongBinder5 = parcel.readStrongBinder();
                Object eventInterceptor;
                if (strongBinder5 == null) {
                    eventInterceptor = fpy3;
                }
                else {
                    final IInterface queryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface5 instanceof fpy) {
                        eventInterceptor = queryLocalInterface5;
                    }
                    else {
                        eventInterceptor = new voy(strongBinder5);
                    }
                }
                uky.b(parcel);
                ((doy)this).setEventInterceptor((fpy)eventInterceptor);
                break;
            }
            case 33: {
                n = parcel.readInt();
                final String string = parcel.readString();
                final g3d x = g3d$a.x(parcel.readStrongBinder());
                final g3d x2 = g3d$a.x(parcel.readStrongBinder());
                final g3d x3 = g3d$a.x(parcel.readStrongBinder());
                uky.b(parcel);
                ((doy)this).logHealthData(n, string, x, x2, x3);
                break;
            }
            case 32: {
                final Bundle bundle3 = (Bundle)uky.a(parcel, Bundle.CREATOR);
                final IBinder strongBinder6 = parcel.readStrongBinder();
                Object o6;
                if (strongBinder6 == null) {
                    o6 = roy2;
                }
                else {
                    final IInterface queryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof roy) {
                        o6 = queryLocalInterface6;
                    }
                    else {
                        o6 = new ioy(strongBinder6);
                    }
                }
                final long long4 = parcel.readLong();
                uky.b(parcel);
                ((doy)this).performAction(bundle3, (roy)o6, long4);
                break;
            }
            case 31: {
                final g3d x4 = g3d$a.x(parcel.readStrongBinder());
                final IBinder strongBinder7 = parcel.readStrongBinder();
                Object o7;
                if (strongBinder7 == null) {
                    o7 = roy3;
                }
                else {
                    final IInterface queryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface7 instanceof roy) {
                        o7 = queryLocalInterface7;
                    }
                    else {
                        o7 = new ioy(strongBinder7);
                    }
                }
                final long long5 = parcel.readLong();
                uky.b(parcel);
                ((doy)this).onActivitySaveInstanceState(x4, (roy)o7, long5);
                break;
            }
            case 30: {
                final g3d x5 = g3d$a.x(parcel.readStrongBinder());
                final long long6 = parcel.readLong();
                uky.b(parcel);
                ((doy)this).onActivityResumed(x5, long6);
                break;
            }
            case 29: {
                final g3d x6 = g3d$a.x(parcel.readStrongBinder());
                final long long7 = parcel.readLong();
                uky.b(parcel);
                ((doy)this).onActivityPaused(x6, long7);
                break;
            }
            case 28: {
                final g3d x7 = g3d$a.x(parcel.readStrongBinder());
                final long long8 = parcel.readLong();
                uky.b(parcel);
                ((doy)this).onActivityDestroyed(x7, long8);
                break;
            }
            case 27: {
                final g3d x8 = g3d$a.x(parcel.readStrongBinder());
                final Bundle bundle4 = (Bundle)uky.a(parcel, Bundle.CREATOR);
                final long long9 = parcel.readLong();
                uky.b(parcel);
                ((doy)this).onActivityCreated(x8, bundle4, long9);
                break;
            }
            case 26: {
                final g3d x9 = g3d$a.x(parcel.readStrongBinder());
                final long long10 = parcel.readLong();
                uky.b(parcel);
                ((doy)this).onActivityStopped(x9, long10);
                break;
            }
            case 25: {
                final g3d x10 = g3d$a.x(parcel.readStrongBinder());
                final long long11 = parcel.readLong();
                uky.b(parcel);
                ((doy)this).onActivityStarted(x10, long11);
                break;
            }
            case 24: {
                final String string2 = parcel.readString();
                final long long12 = parcel.readLong();
                uky.b(parcel);
                ((doy)this).endAdUnitExposure(string2, long12);
                break;
            }
            case 23: {
                final String string3 = parcel.readString();
                final long long13 = parcel.readLong();
                uky.b(parcel);
                ((doy)this).beginAdUnitExposure(string3, long13);
                break;
            }
            case 22: {
                final IBinder strongBinder8 = parcel.readStrongBinder();
                Object o8;
                if (strongBinder8 == null) {
                    o8 = roy4;
                }
                else {
                    final IInterface queryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof roy) {
                        o8 = queryLocalInterface8;
                    }
                    else {
                        o8 = new ioy(strongBinder8);
                    }
                }
                uky.b(parcel);
                ((doy)this).generateEventId((roy)o8);
                break;
            }
            case 21: {
                final IBinder strongBinder9 = parcel.readStrongBinder();
                Object o9;
                if (strongBinder9 == null) {
                    o9 = roy5;
                }
                else {
                    final IInterface queryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof roy) {
                        o9 = queryLocalInterface9;
                    }
                    else {
                        o9 = new ioy(strongBinder9);
                    }
                }
                uky.b(parcel);
                ((doy)this).getGmpAppId((roy)o9);
                break;
            }
            case 20: {
                final IBinder strongBinder10 = parcel.readStrongBinder();
                Object o10;
                if (strongBinder10 == null) {
                    o10 = roy6;
                }
                else {
                    final IInterface queryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof roy) {
                        o10 = queryLocalInterface10;
                    }
                    else {
                        o10 = new ioy(strongBinder10);
                    }
                }
                uky.b(parcel);
                ((doy)this).getAppInstanceId((roy)o10);
                break;
            }
            case 19: {
                final IBinder strongBinder11 = parcel.readStrongBinder();
                Object o11;
                if (strongBinder11 == null) {
                    o11 = roy7;
                }
                else {
                    final IInterface queryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof roy) {
                        o11 = queryLocalInterface11;
                    }
                    else {
                        o11 = new ioy(strongBinder11);
                    }
                }
                uky.b(parcel);
                ((doy)this).getCachedAppInstanceId((roy)o11);
                break;
            }
            case 18: {
                final IBinder strongBinder12 = parcel.readStrongBinder();
                Object instanceIdProvider;
                if (strongBinder12 == null) {
                    instanceIdProvider = lpy;
                }
                else {
                    final IInterface queryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface12 instanceof lpy) {
                        instanceIdProvider = queryLocalInterface12;
                    }
                    else {
                        instanceIdProvider = new ipy(strongBinder12);
                    }
                }
                uky.b(parcel);
                ((doy)this).setInstanceIdProvider((lpy)instanceIdProvider);
                break;
            }
            case 17: {
                final IBinder strongBinder13 = parcel.readStrongBinder();
                Object o12;
                if (strongBinder13 == null) {
                    o12 = roy8;
                }
                else {
                    final IInterface queryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof roy) {
                        o12 = queryLocalInterface13;
                    }
                    else {
                        o12 = new ioy(strongBinder13);
                    }
                }
                uky.b(parcel);
                ((doy)this).getCurrentScreenClass((roy)o12);
                break;
            }
            case 16: {
                final IBinder strongBinder14 = parcel.readStrongBinder();
                Object o13;
                if (strongBinder14 == null) {
                    o13 = roy9;
                }
                else {
                    final IInterface queryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface14 instanceof roy) {
                        o13 = queryLocalInterface14;
                    }
                    else {
                        o13 = new ioy(strongBinder14);
                    }
                }
                uky.b(parcel);
                ((doy)this).getCurrentScreenName((roy)o13);
                break;
            }
            case 15: {
                final g3d x11 = g3d$a.x(parcel.readStrongBinder());
                final String string4 = parcel.readString();
                final String string5 = parcel.readString();
                final long long14 = parcel.readLong();
                uky.b(parcel);
                ((doy)this).setCurrentScreen(x11, string4, string5, long14);
                break;
            }
            case 14: {
                final long long15 = parcel.readLong();
                uky.b(parcel);
                ((doy)this).setSessionTimeoutDuration(long15);
                break;
            }
            case 13: {
                final long long16 = parcel.readLong();
                uky.b(parcel);
                ((doy)this).setMinimumSessionDuration(long16);
                break;
            }
            case 12: {
                final long long17 = parcel.readLong();
                uky.b(parcel);
                ((doy)this).resetAnalyticsData(long17);
                break;
            }
            case 11: {
                final ClassLoader a2 = uky.a;
                boolean b3 = b;
                if (parcel.readInt() != 0) {
                    b3 = true;
                }
                final long long18 = parcel.readLong();
                uky.b(parcel);
                ((doy)this).setMeasurementEnabled(b3, long18);
                break;
            }
            case 10: {
                final String string6 = parcel.readString();
                final String string7 = parcel.readString();
                final IBinder strongBinder15 = parcel.readStrongBinder();
                Object o14;
                if (strongBinder15 == null) {
                    o14 = roy10;
                }
                else {
                    final IInterface queryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface15 instanceof roy) {
                        o14 = queryLocalInterface15;
                    }
                    else {
                        o14 = new ioy(strongBinder15);
                    }
                }
                uky.b(parcel);
                ((doy)this).getConditionalUserProperties(string6, string7, (roy)o14);
                break;
            }
            case 9: {
                final String string8 = parcel.readString();
                final String string9 = parcel.readString();
                final Bundle bundle5 = (Bundle)uky.a(parcel, Bundle.CREATOR);
                uky.b(parcel);
                ((doy)this).clearConditionalUserProperty(string8, string9, bundle5);
                break;
            }
            case 8: {
                final Bundle bundle6 = (Bundle)uky.a(parcel, Bundle.CREATOR);
                final long long19 = parcel.readLong();
                uky.b(parcel);
                ((doy)this).setConditionalUserProperty(bundle6, long19);
                break;
            }
            case 7: {
                final String string10 = parcel.readString();
                final long long20 = parcel.readLong();
                uky.b(parcel);
                ((doy)this).setUserId(string10, long20);
                break;
            }
            case 6: {
                final String string11 = parcel.readString();
                final IBinder strongBinder16 = parcel.readStrongBinder();
                Object o15;
                if (strongBinder16 == null) {
                    o15 = roy11;
                }
                else {
                    final IInterface queryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface16 instanceof roy) {
                        o15 = queryLocalInterface16;
                    }
                    else {
                        o15 = new ioy(strongBinder16);
                    }
                }
                uky.b(parcel);
                ((doy)this).getMaxUserProperties(string11, (roy)o15);
                break;
            }
            case 5: {
                final String string12 = parcel.readString();
                final String string13 = parcel.readString();
                final ClassLoader a3 = uky.a;
                boolean b4 = b2;
                if (parcel.readInt() != 0) {
                    b4 = true;
                }
                final IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    final IInterface queryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof roy) {
                        o = queryLocalInterface17;
                    }
                    else {
                        o = new ioy(strongBinder17);
                    }
                }
                uky.b(parcel);
                ((doy)this).getUserProperties(string12, string13, b4, (roy)o);
                break;
            }
            case 4: {
                final String string14 = parcel.readString();
                final String string15 = parcel.readString();
                final g3d x12 = g3d$a.x(parcel.readStrongBinder());
                final ClassLoader a4 = uky.a;
                final boolean b5 = parcel.readInt() != 0;
                final long long21 = parcel.readLong();
                uky.b(parcel);
                ((doy)this).setUserProperty(string14, string15, x12, b5, long21);
                break;
            }
            case 3: {
                final String string16 = parcel.readString();
                final String string17 = parcel.readString();
                final Bundle bundle7 = (Bundle)uky.a(parcel, Bundle.CREATOR);
                final IBinder strongBinder18 = parcel.readStrongBinder();
                Object o16;
                if (strongBinder18 == null) {
                    o16 = roy12;
                }
                else {
                    final IInterface queryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof roy) {
                        o16 = queryLocalInterface18;
                    }
                    else {
                        o16 = new ioy(strongBinder18);
                    }
                }
                final long long22 = parcel.readLong();
                uky.b(parcel);
                ((doy)this).logEventAndBundle(string16, string17, bundle7, (roy)o16, long22);
                break;
            }
            case 2: {
                final String string18 = parcel.readString();
                final String string19 = parcel.readString();
                final Bundle bundle8 = (Bundle)uky.a(parcel, Bundle.CREATOR);
                final boolean b6 = parcel.readInt() != 0;
                final boolean b7 = parcel.readInt() != 0;
                final long long23 = parcel.readLong();
                uky.b(parcel);
                ((doy)this).logEvent(string18, string19, bundle8, b6, b7, long23);
                break;
            }
            case 1: {
                final g3d x13 = g3d$a.x(parcel.readStrongBinder());
                final ppy ppy = (ppy)uky.a(parcel, ppy.CREATOR);
                final long long24 = parcel.readLong();
                uky.b(parcel);
                ((doy)this).initialize(x13, ppy, long24);
                break;
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
