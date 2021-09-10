create table if not exists properties (
    id int8 not null,
    application text,
    profile text,
    key text not null,
    value text,
    created_at timestamp not null,
    updated_at timestamp not null,
    primary key (id)
);