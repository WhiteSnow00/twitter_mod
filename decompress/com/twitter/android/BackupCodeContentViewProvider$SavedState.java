// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android;

import java.io.IOException;
import android.os.Parcel;
import android.os.Parcelable$Creator;

@lpe
public class BackupCodeContentViewProvider$SavedState<OBJ extends BackupCodeContentViewProvider> extends dq1<OBJ>
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new BackupCodeContentViewProvider$SavedState$a();
    }
    
    public BackupCodeContentViewProvider$SavedState(final Parcel parcel) {
        super(parcel);
    }
    
    public BackupCodeContentViewProvider$SavedState(final OBJ obj) {
        super((Object)obj);
    }
    
    public OBJ deserializeValue(final elp elp, final OBJ obj) throws IOException, ClassNotFoundException {
        final BackupCodeContentViewProvider backupCodeContentViewProvider = (BackupCodeContentViewProvider)super.deserializeValue(elp, (Object)obj);
        backupCodeContentViewProvider.b1 = elp.u();
        return (OBJ)backupCodeContentViewProvider;
    }
    
    public void serializeValue(final flp flp, final OBJ obj) throws IOException {
        super.serializeValue(flp, (Object)obj);
        flp.t(obj.b1);
    }
}
