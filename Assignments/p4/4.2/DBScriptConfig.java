package com.battle.ship.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.sql.SQLException;

//@Configuration
@Component
public class DBScriptConfig {

    @Value("classpath:SQL/MakeTables/cartridge.psql")
    Resource cartridgescript;

    @Value("classpath:SQL/MakeTables/gun.psql")
    Resource gunscript;

    @Value("classpath:SQL/MakeTables/GunState.psql")
    Resource GunStatescript;

    @Value("classpath:SQL/MakeTables/projectile.psql")
    Resource projectilescript;

    @Value("classpath:SQL/MakeTables/ship_guns.psql")
    Resource ship_gunsgunscript;

    @Value("classpath:SQL/MakeTables/ShipState.psql")
    Resource ShipStatescript;

    @Value("classpath:SQL/MakeTables/torpedo.psql")
    Resource torpedoscript;

    @Value("classpath:SQL/MakeTables/torpedo_state.psql")
    Resource torpedo_statescript;

    @Autowired
    JdbcTemplate jdbcTemplate;

    //@PostConstruct
    public void executeScript() throws SQLException {
        ScriptUtils.executeSqlScript(
                jdbcTemplate.getDataSource().getConnection(), cartridgescript);
        ScriptUtils.executeSqlScript(
                jdbcTemplate.getDataSource().getConnection(), gunscript);
        ScriptUtils.executeSqlScript(
                jdbcTemplate.getDataSource().getConnection(), GunStatescript);

        ScriptUtils.executeSqlScript(
                jdbcTemplate.getDataSource().getConnection(), projectilescript);
        ScriptUtils.executeSqlScript(
                jdbcTemplate.getDataSource().getConnection(), ship_gunsgunscript);
        ScriptUtils.executeSqlScript(
                jdbcTemplate.getDataSource().getConnection(), ShipStatescript);
        ScriptUtils.executeSqlScript(
                jdbcTemplate.getDataSource().getConnection(), torpedoscript);
        ScriptUtils.executeSqlScript(
                jdbcTemplate.getDataSource().getConnection(), torpedo_statescript);
    }
}
