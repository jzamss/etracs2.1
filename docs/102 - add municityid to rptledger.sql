alter table rptledger add column municityid varchar(50);
alter table rptledger add column municityname varchar(50);

update rptledger rl, faaslist fl, lgu lgu, lgu plgu set
	rl.municityid =case when plgu.lgutype ='MUNICIPALITY' then plgu.objid else plgu.parentid end,
	rl.municityname =case when plgu.lgutype ='MUNICIPALITY' then plgu.lguname else (SELECT lguname FROM lgu WHERE parentid is null) end
where rl.faasid = fl.objid 
  and fl.barangayid = lgu.objid 
  and lgu.parentid = plgu.objid;

