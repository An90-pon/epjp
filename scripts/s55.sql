insert into regions(region_id, region_name)
values (11, 'Antarctica');						-- per fare in modo che l'inserimento persista dobbiamo usare un comando che si chiama commit, se voglio buttare via il cambiamento scrivo rollback

insert into regions(region_id)
values (12);

insert into regions
values (13, null);
