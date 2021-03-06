package com.speedment.examples.generated.socialnetwork.db0.socialnetwork.user.generated;

import com.speedment.common.injector.annotation.ExecuteBefore;
import com.speedment.examples.generated.socialnetwork.db0.socialnetwork.user.User;
import com.speedment.examples.generated.socialnetwork.db0.socialnetwork.user.UserImpl;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.sql.SqlPersistenceComponent;
import com.speedment.runtime.core.component.sql.SqlStreamSupplierComponent;
import com.speedment.runtime.core.exception.SpeedmentException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.annotation.Generated;
import static com.speedment.common.injector.State.RESOLVED;
import static com.speedment.runtime.core.internal.util.sql.ResultSetUtil.*;

/**
 * The generated Sql Adapter for a {@link
 * com.speedment.examples.generated.socialnetwork.db0.socialnetwork.user.User}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public abstract class GeneratedUserSqlAdapter {
    
    private final TableIdentifier<User> tableIdentifier;
    
    protected GeneratedUserSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("db0", "socialnetwork", "user");
    }
    
    @ExecuteBefore(RESOLVED)
    void installMethodName(SqlStreamSupplierComponent streamSupplierComponent, SqlPersistenceComponent persistenceComponent) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }
    
    protected User apply(ResultSet resultSet) throws SpeedmentException {
        final User entity = createEntity();
        try {
            entity.setId(        resultSet.getLong(1)    );
            entity.setMail(      resultSet.getString(2)  );
            entity.setPassword(  resultSet.getString(3)  );
            entity.setFirstName( getString(resultSet, 4) );
            entity.setLastName(  getString(resultSet, 5) );
            entity.setAvatar(    getString(resultSet, 6) );
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }
    
    protected UserImpl createEntity() {
        return new UserImpl();
    }
}